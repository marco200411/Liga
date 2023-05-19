package Methods;

import java.util.Date;

public class Partido {
    private Usuario usuarioLocal;
    private Usuario usuarioVisitante;
    private Date fechaPartido;
    private Date horaPartido;
    private String resultado;
    private int puntosLocal;
    private int puntosVisitante;

    public Partido(Usuario usuarioLocal, Usuario usuarioVisitante, Date fechaPartido, Date horaPartido, String resultado, int puntosLocal, int puntosVisitante) {
        this.usuarioLocal = usuarioLocal;
        this.usuarioVisitante = usuarioVisitante;
        this.fechaPartido = fechaPartido;
        this.horaPartido = horaPartido;
        this.resultado = resultado;
        this.puntosLocal = puntosLocal;
        this.puntosVisitante = puntosVisitante;
    }

    public Usuario getUsuarioLocal() {
        return usuarioLocal;
    }

    public void setUsuarioLocal(Usuario usuarioLocal) {
        this.usuarioLocal = usuarioLocal;
    }

    public Usuario getUsuarioVisitante() {
        return usuarioVisitante;
    }

    public void setUsuarioVisitante(Usuario usuarioVisitante) {
        this.usuarioVisitante = usuarioVisitante;
    }

    public Date getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(Date fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    public Date getHoraPartido() {
        return horaPartido;
    }

    public void setHoraPartido(Date horaPartido) {
        this.horaPartido = horaPartido;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public int getPuntosLocal() {
        return puntosLocal;
    }

    public void setPuntosLocal(int puntosLocal) {
        this.puntosLocal = puntosLocal;
    }

    public int getPuntosVisitante() {
        return puntosVisitante;
    }

    public void setPuntosVisitante(int puntosVisitante) {
        this.puntosVisitante = puntosVisitante;
    }
    
    
    
}
