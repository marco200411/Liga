drop trigger if exists trg_creacion_equipo_liga;
DROP TRIGGER IF EXISTS trg_creacion_equipo_liga;
DELIMITER //

CREATE TRIGGER trg_creacion_equipo_liga
AFTER INSERT ON tbl_equipo
FOR EACH ROW
BEGIN
    -- Obtener el ID del nuevo equipo y la liga a la que pertenece
    DECLARE new_equipo_id INT;
    DECLARE new_liga_id INT;

    -- Variable para almacenar la fecha de inicio (primer viernes después de la fecha actual)
    DECLARE start_date DATE;

    -- Variable para almacenar el intervalo de tiempo (7 días)
    DECLARE time_interval INT;
    SET time_interval = 7;  -- Intervalo en días

    SET start_date = CURDATE() + INTERVAL (4 - WEEKDAY(CURDATE()) + 7) % 7 DAY;
    SET new_equipo_id = NEW.ID_EQUIPO;
    SET new_liga_id = NEW.LIGA;
    
    -- Validar que el equipo no tenga otros partidos en las mismas fechas
    IF EXISTS (
        SELECT 1
        FROM tbl_partido
        WHERE (EQUIPO_LOCAL = new_equipo_id OR EQUIPO_VISITANTE = new_equipo_id)
            AND DATE(FECHA_INICIO) >= start_date
            AND HORA_INICIO = '13:00:00'
    ) THEN
        -- Encontrar una nueva fecha disponible sin conflictos
        WHILE EXISTS (
            SELECT 1
            FROM tbl_partido
            WHERE (EQUIPO_LOCAL = new_equipo_id OR EQUIPO_VISITANTE = new_equipo_id)
                AND DATE(FECHA_INICIO) = start_date
        ) DO
            SET start_date = start_date + INTERVAL 1 DAY;  -- Cambiar a la siguiente fecha
        END WHILE;
    END IF;

    -- Insertar los partidos para el nuevo equipo en la liga
    INSERT INTO tbl_partido (LIGA, EQUIPO_LOCAL, EQUIPO_VISITANTE, FECHA_INICIO, HORA_INICIO, RESULTADO)
    SELECT new_liga_id, new_equipo_id, eq.ID_EQUIPO, start_date, '13:00:00', 'POR JUGAR'
    FROM tbl_equipo AS eq
    WHERE eq.LIGA = new_liga_id AND eq.ID_EQUIPO <> new_equipo_id;

    -- Incrementar la fecha de inicio para el siguiente partido
    SET start_date = start_date + INTERVAL time_interval DAY;

    -- Insertar los partidos para los equipos existentes en la liga
    INSERT INTO tbl_partido (LIGA, EQUIPO_LOCAL, EQUIPO_VISITANTE, FECHA_INICIO, HORA_INICIO, RESULTADO)
    SELECT new_liga_id, eq.ID_EQUIPO, new_equipo_id, start_date, '13:00:00', 'POR JUGAR'
    FROM tbl_equipo AS eq
    WHERE eq.LIGA = new_liga_id AND eq.ID_EQUIPO <> new_equipo_id;
END //

DELIMITER ;

