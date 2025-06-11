/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author borda
 */
public abstract class Pelicula {
    protected Director director;
    protected int cantidadDeEscenas;
    protected String titulo;
    protected double precio;
    protected static Random generadorDeEscenas;
    
  static{
  generadorDeEscenas = new Random();
  } 

    public Pelicula(String titulo, double precio,Director director) {
        this.director = director;
        this.titulo = titulo;
        this.precio = precio;
    }
    
    public Pelicula(String titulo, double precio,String nombre ,String Apellido ,String DNI){
    this(titulo,precio,new Director(nombre,Apellido,DNI));
    }
  
    public int getCantidadDeEscenas() {
    if (this.cantidadDeEscenas == 0) {
            
        this.cantidadDeEscenas = generadorDeEscenas.nextInt(31) + 20;
    
    }
    
    return this.cantidadDeEscenas;
    }
    
    private static  String mostrar(Pelicula pelicula){
    StringBuilder sb = new StringBuilder();
    sb.append("titulo: ").append(pelicula.titulo).append("\n");
    sb.append("Director : ").append(pelicula.director.toString());
    sb.append("Precio: ").append(pelicula.precio);
    return sb.toString();
    }
    
    public static boolean sonIguales(Pelicula p1 , Pelicula p2){
    if(Director.sonIguales(p1.director, p2.director) && p1.titulo == p2.titulo){
    return true;
    }
    return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pelicula other = (Pelicula) obj;
        return Pelicula.sonIguales(this, other);
    }

    @Override
    public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append(Pelicula.mostrar(this));
         sb.append("Cantidad de escenas : ").append(this.cantidadDeEscenas);
        return sb.toString();
    }
    
    
}

