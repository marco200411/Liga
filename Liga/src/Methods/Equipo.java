/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;

import java.util.ArrayList;

/**
 *
 * @author Marco
 */
public class Equipo {
    
    
    
    Liga liga;
    Entrenador entrenador;
    String nombre;
    int dinero;
    int puntos;
ArrayList<Partido> partidosEquipo = new ArrayList();
    public Equipo(Liga liga, Entrenador entrenador, String nombre, int dinero, int puntos) {
        this.liga = liga;
        this.entrenador = entrenador;
        this.nombre = nombre;
        this.dinero = dinero;
        this.puntos = puntos;
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
