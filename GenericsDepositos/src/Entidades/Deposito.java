/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author borda
 */
public class Deposito <T>{
    private int capacidadMaxima;
    private ArrayList<T> lista;

    public Deposito(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.lista = new ArrayList<>();
        
    }
    
    private int getIndice(T elemento ){
        int indice= -1;
        for (T t : lista) {
            indice ++;
            if(t.equals(elemento)){
                return indice;
            }
        }
        
    return -1;
    }
    
    public boolean agregar(T elemento){
    if(this.lista.size()==this.capacidadMaxima || lista.contains(elemento)){
    return false;
    }
    lista.add(elemento);
    return true;
    
    
    }
    
    public boolean remover(T elemento){
    int indice = this.getIndice(elemento);
    
    if (indice >= 0 ){
    lista.remove(indice);
    return true;
    }
    return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Deposito{");
        sb.append("capacidadMaxima=").append(capacidadMaxima);
        for (T t : lista) {
            sb.append(t.toString());
        }
        return sb.toString();
    }
    
    
}
