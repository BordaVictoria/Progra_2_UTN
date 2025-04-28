/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASE4;

/**
 *
 * @author borda
 */
public class numeracion {
    public void numerador(){
        
    StringBuilder contador = new StringBuilder();
    
    for(int i = 1 ; i<=100;i++){
    contador.append(i).append("-");
    }
    contador.deleteCharAt(contador.length() - 1); 
        System.out.println("numeros: " + contador);
    }
    
}
