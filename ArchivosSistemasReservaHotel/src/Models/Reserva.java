
package Models;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reserva implements ArchivosTXT {

    private Cliente cliente;
    private Habitacion habitacion;
    private int cantidadDias;

    public Reserva(){};
    
    public Reserva(Cliente cliente, Habitacion habitacion, int cantidadDias) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.cantidadDias = cantidadDias;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }
    
    public double getPrecioTotal(){
    return this.habitacion.getPrecio()*this.cantidadDias;
    }
    
    
    @Override
    public Reserva leerDinamico(String dato ) {
        String[] datos = dato.split(",");
        Cliente c1 = new Cliente(datos[0]);
        int numeroHabitacion = Integer.parseInt(datos[1]);
        TipoHabitacion tipo = TipoHabitacion.valueOf(datos[2]);
        int cantidadDias = Integer.parseInt(datos[3]);
        Habitacion h = null;
        switch (tipo) {
            case TipoHabitacion.SIMPLE:
                h = new HabitacionSimple(numeroHabitacion, tipo);
                
            case TipoHabitacion.SUITE:
                h= new HabitacionSuite(tipo, numeroHabitacion);
        }
        Reserva r = new Reserva(c1,h,cantidadDias);
      return r;  
    }

    @Override
    public String escribirDinamico() {
    StringBuilder sb = new StringBuilder();
    sb.append(this.cliente.toString()).append(",");
    sb.append(this.habitacion.numero).append(",");
    sb.append(this.cantidadDias).append(",");
    sb.append(this.getPrecioTotal()).append(",");
    sb.append("\n");
    
    return sb.toString();
    }
}
