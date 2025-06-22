/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Objects;

/**
 *
 * @author borda
 */
public abstract class Empleado {
    protected String nombre;
    protected int sueldoBase;
    protected int horasExtra;

    public Empleado(){};
    
    public Empleado(String nombre, int sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.horasExtra=0;
    }
    
    public Empleado(String nombre,int sueldo,int horasExtra){
    this(nombre,sueldo);
    this.horasExtra = horasExtra;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("nombre=").append(nombre);
        sb.append(", sueldoBase=").append(sueldoBase);
        sb.append(", horasExtra=").append(horasExtra);
        sb.append('}');
        return sb.toString();
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
        final Empleado other = (Empleado) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    
    
    
    
}
