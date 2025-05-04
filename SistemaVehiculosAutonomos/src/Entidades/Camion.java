/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author borda
 */
public class Camion extends VehiculoAutonomo{
    private String estado;

    public Camion(String marca, String modelo) {
        super(marca, modelo);
        this.estado = "Sin activar";
    }
    
    
    @Override 
    public void moverse(){
    this.estado = "Moviendose con acoplado";
    }
    @Override
    public void detenerse(){
    this.estado = "Camion parado ";
    }
    @Override
    public String reportarEstado(){
    return this.marca+" " + this.modelo +" "+this.estado;
    }
    
}
