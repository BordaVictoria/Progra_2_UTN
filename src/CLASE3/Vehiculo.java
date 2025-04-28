/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASE3;

/**
 *
 * @author borda
 */
public class Vehiculo {
    
    String marca;
    String modelo;
    int año;
    
    //////////////////// esto es un constructorrrrr
    // se llama igual que la clase 
    public Vehiculo(String marca, String modelo, int anio){
        this.marca=marca;
        this.modelo=modelo;
        this.año = anio;
        
    }
    
    public String mostrar(){
    
        return this.año+" "+this.modelo+" "+this.marca;
    }
    
    
}


