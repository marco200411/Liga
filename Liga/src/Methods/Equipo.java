
package Methods;

import java.util.ArrayList;

public class Equipo {

    Liga liga;
    Entrenador entrenador;
    String nombre;
    int dinero;
    int puntos;
    int victorias;
    int derrotas;
    ArrayList<Partido> partidosEquipo = new ArrayList();
    ArrayList<Sobre> sobresAbiertos = new ArrayList();

    public Equipo(Liga liga, Entrenador entrenador, String nombre, int dinero, int puntos, int victorias, int derrotas) {
        this.liga = liga;
        this.entrenador = entrenador;
        this.nombre = nombre;
        this.dinero = dinero;
        this.puntos = puntos;
        this.victorias = victorias;
        this.derrotas = derrotas;
    }

    
    
    
    public ArrayList<Sobre> getSobresAbiertos() {
        return sobresAbiertos;
    }

    public void setSobresAbiertos(ArrayList<Sobre> sobresAbiertos) {
        this.sobresAbiertos = sobresAbiertos;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public ArrayList<Partido> getPartidosEquipo() {
        return partidosEquipo;
    }

    public void setPartidosEquipo(ArrayList<Partido> partidosEquipo) {
        this.partidosEquipo = partidosEquipo;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

}
