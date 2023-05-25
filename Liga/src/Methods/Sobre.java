package Methods;

import java.util.ArrayList;

public class Sobre {
    String nombre;
    int cantidad_jugadores;
    int precio;
    ArrayList<Futbolista> contenidoSobre = new ArrayList();
    public Sobre(String nombre, int cantidad_jugadores, int precio) {
        this.nombre = nombre;
        this.cantidad_jugadores = cantidad_jugadores;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad_jugadores() {
        return cantidad_jugadores;
    }

    public void setCantidad_jugadores(int cantidad_jugadores) {
        this.cantidad_jugadores = cantidad_jugadores;
    }

    public ArrayList<Futbolista> getContenidoSobre() {
        return contenidoSobre;
    }

    public void setContenidoSobre(ArrayList<Futbolista> contenidoSobre) {
        this.contenidoSobre = contenidoSobre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
