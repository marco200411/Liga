package Methods;

import java.util.Date;

/**
 * La clase Partido representa un partido de fútbol entre dos usuarios.
 *
 * author Marco
 */
public class Partido {
    private Usuario usuarioLocal;
    private Usuario usuarioVisitante;
    private Date fechaPartido;
    private Date horaPartido;
    private String resultado;
    private int puntosLocal;
    private int puntosVisitante;

    /**
     * Crea una instancia de la clase Partido con los atributos especificados.
     *
     * @param usuarioLocal      El usuario local que participa en el partido.
     * @param usuarioVisitante  El usuario visitante que participa en el partido.
     * @param fechaPartido      La fecha del partido.
     * @param horaPartido       La hora del partido.
     * @param resultado         El resultado del partido.
     * @param puntosLocal       Los puntos obtenidos por el usuario local en el partido.
     * @param puntosVisitante   Los puntos obtenidos por el usuario visitante en el partido.
     */
    public Partido(Usuario usuarioLocal, Usuario usuarioVisitante, Date fechaPartido, Date horaPartido, String resultado, int puntosLocal, int puntosVisitante) {
        this.usuarioLocal = usuarioLocal;
        this.usuarioVisitante = usuarioVisitante;
        this.fechaPartido = fechaPartido;
        this.horaPartido = horaPartido;
        this.resultado = resultado;
        this.puntosLocal = puntosLocal;
        this.puntosVisitante = puntosVisitante;
    }

    /**
     * Obtiene el usuario local que participa en el partido.
     *
     * @return El usuario local del partido.
     */
    public Usuario getUsuarioLocal() {
        return usuarioLocal;
    }

    /**
     * Establece el usuario local que participa en el partido.
     *
     * @param usuarioLocal El usuario local del partido.
     */
    public void setUsuarioLocal(Usuario usuarioLocal) {
        this.usuarioLocal = usuarioLocal;
    }

    /**
     * Obtiene el usuario visitante que participa en el partido.
     *
     * @return El usuario visitante del partido.
     */
    public Usuario getUsuarioVisitante() {
        return usuarioVisitante;
    }

    /**
     * Establece el usuario visitante que participa en el partido.
     *
     * @param usuarioVisitante El usuario visitante del partido.
     */
    public void setUsuarioVisitante(Usuario usuarioVisitante) {
        this.usuarioVisitante = usuarioVisitante;
    }

    /**
     * Obtiene la fecha del partido.
     *
     * @return La fecha del partido.
     */
    public Date getFechaPartido() {
        return fechaPartido;
    }

    /**
     * Establece la fecha del partido.
     *
     * @param fechaPartido La fecha del partido.
     */
    public void setFechaPartido(Date fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    /**
     * Obtiene la hora del partido.
     *
     * @return La hora del partido.
     */
    public Date getHoraPartido() {
        return horaPartido;
    }

    /**
     * Establece la hora del partido.
     *
     * @param horaPartido La hora del partido.
     */
    public void setHoraPartido(Date horaPartido) {
        this.horaPartido = horaPartido;
    }

    /**
     * Obtiene el resultado del partido.
     *
     * @return El resultado del partido.
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * Establece el resultado del partido.
     *
     * @param resultado El resultado del partido.
     */
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    /**
     * Obtiene los puntos obtenidos por el usuario local en el partido.
     *
     * @return Los puntos obtenidos por el usuario local.
     */
    public int getPuntosLocal() {
        return puntosLocal;
    }

    /**
     * Establece los puntos obtenidos por el usuario local en el partido.
     *
     * @param puntosLocal Los puntos obtenidos por el usuario local.
     */
    public void setPuntosLocal(int puntosLocal) {
        this.puntosLocal = puntosLocal;
    }

    /**
     * Obtiene los puntos obtenidos por el usuario visitante en el partido.
     *
     * @return Los puntos obtenidos por el usuario visitante.
     */
    public int getPuntosVisitante() {
        return puntosVisitante;
    }

    /**
     * Establece los puntos obtenidos por el usuario visitante en el partido.
     *
     * @param puntosVisitante Los puntos obtenidos por el usuario visitante.
     */
    public void setPuntosVisitante(int puntosVisitante) {
        this.puntosVisitante = puntosVisitante;
    }
}
