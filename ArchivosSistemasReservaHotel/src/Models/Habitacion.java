/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author borda
 */
public abstract class Habitacion {
    protected int numero;
    protected double precio;

    public Habitacion( int numero) {
        this.numero = numero;
        this.precio = 200.5;
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
        final Habitacion other = (Habitacion) obj;
        return this.numero == other.numero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Habitacion{");
        sb.append(", numero=").append(numero);
        sb.append(", precio=").append(precio);
        return sb.toString();
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecio() {
        return precio;
    }
    
    public abstract void setPrecio();


   
    
    
    
}
