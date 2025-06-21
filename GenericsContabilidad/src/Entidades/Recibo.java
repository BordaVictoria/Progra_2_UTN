/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author borda
 */
public class Recibo extends Documento {

    public Recibo(int numero) {
        super(numero);
    }
    public Recibo(){
    super.numero = 0 ;
    };

    @Override
    public String toString() {
        return super.toString()+ "Recibo{" + '}';
    }
    
    
}
