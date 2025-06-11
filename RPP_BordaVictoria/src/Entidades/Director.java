/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author borda
 */
public class Director {
    private String nombre,apellido,DNI;

    public Director(String nombre, String apellido, String DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }
    
       public static boolean sonIguales(Director d1 , Director d2 ){
    if(d1.nombre.equals(d2.nombre) && d1.DNI.equals(d2.DNI) && d1.apellido.equals(d2.apellido)){
    return true;
    }
    return false;
    }
       
    @Override
    public String toString() {
        return "Nombre=" + nombre + ", Apellido=" + apellido;
    }
    
    
}
