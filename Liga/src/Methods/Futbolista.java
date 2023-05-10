/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;

/**
 *
 * @author a22marcorr
 */
public class Futbolista extends Persona{
    String nombre;
    String posicion;
    String precio;
    int ataque;
    int defensa;
    String imagen;
    
    
      public Futbolista(String nombre, String posicion, String precio, int ataque, int defensa, String imagen) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.precio = precio;
        this.ataque = ataque;
        this.defensa = defensa;
        this.imagen = imagen;
     
    }
      
      public String getNombre() {
        return nombre;
    }
    
}
