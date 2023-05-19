drop trigger if exists trg_insertar_partido2;
DELIMITER //

CREATE TRIGGER trg_insertar_partido2
BEFORE INSERT ON tbl_partido
FOR EACH ROW
BEGIN
    -- Obtener el ID del equipo local y visitante del nuevo partido
    DECLARE equipo_local_id INT;
    DECLARE equipo_visitante_id INT;
   

    -- Obtener la fecha de inicio del nuevo partido
    DECLARE fecha_partido DATE;
    SET fecha_partido = NEW.FECHA_INICIO;
 SET equipo_local_id = NEW.EQUIPO_LOCAL;
    SET equipo_visitante_id = NEW.EQUIPO_VISITANTE;
    -- Verificar si el equipo local tiene un partido en la misma fecha
    IF EXISTS (
        SELECT 1
        FROM tbl_partido
        WHERE EQUIPO_LOCAL = equipo_local_id
            AND DATE(FECHA_INICIO) = fecha_partido
            AND HORA_INICIO = '13:00'
    ) THEN
        -- Cambiar la fecha a dos días después
        SET NEW.FECHA_INICIO = fecha_partido + INTERVAL 8 DAY;
    END IF;

    -- Verificar si el equipo visitante tiene un partido en la misma fecha
    IF EXISTS (
        SELECT 1
        FROM tbl_partido
        WHERE EQUIPO_VISITANTE = equipo_visitante_id
            AND DATE(FECHA_INICIO) = fecha_partido
            AND HORA_INICIO = '13:00'
    ) THEN
        -- Cambiar la fecha a dos días después
        SET NEW.FECHA_INICIO = fecha_partido + INTERVAL 2 DAY;
    END IF;
END //

DELIMITER ;