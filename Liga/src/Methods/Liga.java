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
public class Liga {

    String Nombre;
    String Administrador;

    ArrayList<Usuario> integrantes = new ArrayList();
    ArrayList<Futbolista> jugadoresJugando = new ArrayList();
    private ArrayList<Futbolista> jugadoresLibres = new ArrayList();
    private ArrayList<Futbolista> jugadoresLibresPortero = new ArrayList();
    private ArrayList<Futbolista> jugadoresLibresDefensa = new ArrayList();
    private ArrayList<Futbolista> jugadoresLibresMedio = new ArrayList();
    private ArrayList<Futbolista> jugadoresLibresDelantero = new ArrayList();

    public Liga(String Nombre, String Administrador) {
        this.Nombre = Nombre;
        this.Administrador = Administrador;

    }

    public ArrayList<Futbolista> getJugadoresLibresPortero() {
        return jugadoresLibresPortero;
    }

    public void setJugadoresLibresPortero(ArrayList<Futbolista> jugadoresLibresPortero) {
        this.jugadoresLibresPortero = jugadoresLibresPortero;
    }

    public ArrayList<Futbolista> getJugadoresLibresDefensa() {
        return jugadoresLibresDefensa;
    }

    public void setJugadoresLibresDefensa(ArrayList<Futbolista> jugadoresLibresDefensa) {
        this.jugadoresLibresDefensa = jugadoresLibresDefensa;
    }

    public ArrayList<Futbolista> getJugadoresLibresMedio() {
        return jugadoresLibresMedio;
    }

    public void setJugadoresLibresMedio(ArrayList<Futbolista> jugadoresLibresMedio) {
        this.jugadoresLibresMedio = jugadoresLibresMedio;
    }

    public ArrayList<Futbolista> getJugadoresLibresDelantero() {
        return jugadoresLibresDelantero;
    }

    public void setJugadoresLibresDelantero(ArrayList<Futbolista> jugadoresLibresDelantero) {
        this.jugadoresLibresDelantero = jugadoresLibresDelantero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAdministrador() {
        return Administrador;
    }

    public void setAdministrador(String Administrador) {
        this.Administrador = Administrador;
    }

    public ArrayList<Usuario> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<Usuario> integrantes) {
        this.integrantes = integrantes;
    }

    public ArrayList<Futbolista> getJugadoresJugando() {
        return jugadoresJugando;
    }

    public void setJugadoresJugando(ArrayList<Futbolista> jugadoresJugando) {
        this.jugadoresJugando = jugadoresJugando;
    }

    public ArrayList<Futbolista> getJugadoresLibres() {
        return jugadoresLibres;
    }

    public void setJugadoresLibres(ArrayList<Futbolista> jugadoresLibres) {
        this.jugadoresLibres = jugadoresLibres;
    }

    public boolean insertarUsuario(Usuario us) {

        boolean resultado = false;
        if (!integrantes.contains(us)) {
            resultado = true;
            integrantes.add(us);
        } else {
            resultado = false;
        }

        return resultado;
    }

    public boolean insertarJugador(Futbolista f1) {

        boolean resultado = false;
        if (!jugadoresJugando.contains(f1)) {
            resultado = true;
            jugadoresJugando.add(f1);
        } else {
            resultado = false;
        }

        return resultado;
    }

    

}
