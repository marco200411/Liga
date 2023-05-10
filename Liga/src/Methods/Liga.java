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
    ArrayList<Futbolista> jugadoresLibres = new ArrayList();

    public Liga(String Nombre, String Administrador) {
        this.Nombre = Nombre;
        this.Administrador = Administrador;

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
     
     public boolean insertarJugadorLibre(Futbolista f1) {

        boolean resultado = false;
        if (!jugadoresLibres.contains(f1)) {
            resultado = true;
            jugadoresLibres.add(f1);
        } else {
            resultado = false;
        }

        return resultado;
    }

}
