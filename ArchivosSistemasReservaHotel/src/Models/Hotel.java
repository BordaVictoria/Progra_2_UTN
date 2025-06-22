
package Models;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Hotel implements GeneradorReservas {
    private ArrayList<Reserva> reservas;
    private ArrayList<Reserva> resumen;
    public Hotel() {
       this.reservas = new ArrayList();
           this.resumen = new ArrayList();
    }

    @Override
    public ArrayList<Reserva> leerReservas(String path) {
     try (
            BufferedReader lector = new BufferedReader(new FileReader(path));
        ) {
            String linea;

            while ((linea = lector.readLine()) != null) {
               Reserva r = new Reserva().leerDinamico(linea);
               this.reservas.add(r);
            }
            System.out.println("Archivo procesado con éxito.");
        } catch (IOException e) {
            System.err.println("Error al leer o escribir: " + e.getMessage());
        }
    return this.reservas;
    }

    @Override
    public boolean generarResumenPorCliente(Cliente c) {
        for (Reserva reserva : reservas) {
            if(reserva.getCliente().equals(c)){
                this.resumen.add(reserva);
            }
        }
     if(resumen.isEmpty()){
     return false;
     }  
     return true;
    }

    @Override
    public void guardarResumen(String Paht) {
    try (
            BufferedWriter escritor = new BufferedWriter(new FileWriter(Paht))
        ) {
            String header = "CLIENTE ;HABITAICION ; DIAS ; TOTAL A PAGAR ";
            escritor.write(header);
            escritor.newLine();
            for (Reserva reserva : resumen) {
            escritor.write(reserva.escribirDinamico());
        }
            System.out.println("Archivo procesado con éxito.");
        } catch (IOException e) {
            System.err.println("Error al leer o escribir: " + e.getMessage());
        }
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
    
    
    
}
