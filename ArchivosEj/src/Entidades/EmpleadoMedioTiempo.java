/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author borda
 */
public class EmpleadoMedioTiempo extends Empleado implements ISerialisableCSV,ICalculable{
    private TipoEmpleado tipo;
    
    public EmpleadoMedioTiempo(String nombre, int sueldoBase) {
        super(nombre, sueldoBase);
        this.tipo = TipoEmpleado.MEDIOTIEMPO;
    }
    public EmpleadoMedioTiempo(){};
    public EmpleadoMedioTiempo(String nombre, int sueldo, int horasExtra) {
        super(nombre, sueldo, horasExtra);
        this.tipo = TipoEmpleado.MEDIOTIEMPO;
    }

    @Override
    public String toCSV() {
    StringBuilder sb = new StringBuilder();
    sb.append(this.tipo.toString()).append(",");
    sb.append(this.nombre).append(",");
    sb.append(this.sueldoBase).append(",");
    sb.append(this.horasExtra).append(",");
    sb.append(this.calcularSueldo()).append(",");
    
    return sb.toString();
    }

    @Override
    public ISerialisableCSV fromCSV(String data) {
        String[] datos = data.split(",");
        TipoEmpleado tipo = TipoEmpleado.valueOf(datos[0]);
        String nombre = datos[1];
        int SueldoB = Integer.parseInt(datos[2]);
        int horasExtra = Integer.parseInt(datos[3]);
        
        EmpleadoMedioTiempo e1 = new EmpleadoMedioTiempo(nombre, SueldoB, horasExtra);
        
        return e1;
    }

 

    @Override
    public double calcularSueldo() {
    return (this.sueldoBase*0.8)+(this.horasExtra*10);
    }

  
}
