/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author borda
 */
public class Factura extends Documento{

    public Factura(int numero) {
        super(numero);
    }

    @Override
    public String toString() {
        return super.toString() + "Factura{" + '}';
    }

   
    
    
}
