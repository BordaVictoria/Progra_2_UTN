
package Entidades;

import static Entidades.TipoPelicula.ACCION;
import java.util.ArrayList;
import java.util.Iterator;


public class VideoClub implements Iterable<Pelicula>,Iterator<Pelicula>{
    private int capacidad,posicion;
    private ArrayList<Pelicula> peliculas;
    
    public VideoClub(){
    this.capacidad = 3 ;
    this.peliculas = new ArrayList();
    }
    
    public VideoClub(int capacidad){
    this();
    this.capacidad = capacidad;
    }
    
    public boolean sonIguales(Pelicula pelicula){
    if(this.peliculas.contains(pelicula)){
    return true;
    }
    return false;
    }
    
    public void agregar(Pelicula pelicula){
        if(this.peliculas.size()<this.capacidad && !this.sonIguales(pelicula)){
        peliculas.add(pelicula);
            System.out.println("Se agrego ");
        }else{
            System.out.println("No se pudo agregar");
        }      
    }
    
    
    private double getPrecio(TipoPelicula tipo){
    double precioDrama= 0;
    double precioAcc = 0;
    double preciotot= 0;
        for (Pelicula pelicula : peliculas) {
            if(pelicula instanceof PeliculaAccion){
            precioAcc +=((PeliculaAccion) pelicula).getPrecioAlquiler();
            }else if (pelicula instanceof PeliculaDrama){
            precioDrama+= ((PeliculaDrama) pelicula).getPrecioAlquiler();                  
            }
        }
        
        switch (tipo) {
            
            case ACCION:
                preciotot = precioAcc;
                break;  
            
            case DRAMA:
                preciotot= precioDrama;
                break;
            case TODAS:
                preciotot = precioAcc+precioDrama;
                break;
            default:
                throw new AssertionError();
        }
    
        
        return preciotot;
    }
    
    public double getPrecioPeliculasDrama(){
    return this.getPrecio(TipoPelicula.DRAMA);
    }
    public double getPrecioPeliculasAccion(){
    return this.getPrecio(TipoPelicula.ACCION);
    }
    
    public double getPrecioTotal(){
    return this.getPrecio(TipoPelicula.TODAS);
    }

       @Override
    public boolean hasNext() {
        return posicion < peliculas.size();
    }

    @Override
    public Pelicula next() {
        return peliculas.get(posicion++);
    }

    @Override
    public Iterator<Pelicula> iterator() {
        posicion = 0;
        return this;
    }
    
    public static String mostrarTotales(VideoClub videoclub){
    StringBuilder sb = new StringBuilder();
    sb.append("Precios toda las peliculas: ").append(videoclub.getPrecioTotal()).append("\n");
    sb.append("Precios de Drama: ").append(videoclub.getPrecioPeliculasDrama()).append("\n");
    sb.append("Total precio Accion: ").append(videoclub.getPrecioPeliculasAccion()).append("\n");
    sb.append("CANTIDAD PELICULAS: ").append(videoclub.peliculas.size());
    
    return sb.toString();
    }
}
