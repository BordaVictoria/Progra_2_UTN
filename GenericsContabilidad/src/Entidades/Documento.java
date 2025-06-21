/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author borda
 */
public abstract class Documento {
    protected int numero;

    public Documento(int numero) {
        this.numero = numero;
    }
    public Documento(){};

    @Override
    public String toString() {
        return "Documento{" + "numero=" + numero + '}';
    }
    
          
}
