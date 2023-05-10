/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;

import java.util.ArrayList;

/**
 *
 * @author a22marcorr
 */
public class Usuario {
    String nombre;
    String apellidos;
    String nombreUsuario;
    String contraseña;
    String correo;
    String equipo;
    Liga liga;
    private ArrayList<Futbolista> jugadores = new ArrayList();
    ArrayList<Futbolista> entrenadores = new ArrayList();
    ArrayList<Futbolista> plantilla = new ArrayList(10);
    Entrenador entrenadorPlantilla;

    public Usuario(String nombre, String apellidos, String nombreUsuario, String contraseña, String correo, String equipo, Liga liga) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.correo = correo;
        this.equipo = equipo;
        this.liga = liga;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }


    


    public ArrayList<Futbolista> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Futbolista> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Futbolista> getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(ArrayList<Futbolista> entrenadores) {
        this.entrenadores = entrenadores;
    }

    public ArrayList<Futbolista> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(ArrayList<Futbolista> plantilla) {
        this.plantilla = plantilla;
    }

    public Entrenador getEntrenadorPlantilla() {
        return entrenadorPlantilla;
    }

    public void setEntrenadorPlantilla(Entrenador entrenadorPlantilla) {
        this.entrenadorPlantilla = entrenadorPlantilla;
    }

   
    
    
    
    
    
    
}
