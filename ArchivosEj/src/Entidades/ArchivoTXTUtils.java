
package Entidades;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoTXTUtils <T extends Empleado> {
    
    public void crearArchivo(String pathLeer , String pathescribir, String encabezado){
        File archivoEntrada = new File(pathLeer);
        File archivoSalida = new File(pathescribir);


        try (
            BufferedReader lector = new BufferedReader(new FileReader(archivoEntrada));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoSalida))
        ) {
            String linea;
            String header = encabezado;
            escritor.write(header);
            escritor.newLine();
            while ((linea = lector.readLine()) != null) {
                String procesada = linea.toUpperCase();
                escritor.write(procesada);
                escritor.newLine(); // Añade salto de línea
            }
            System.out.println("Archivo procesado con éxito.");
        } catch (IOException e) {
            System.err.println("Error al leer o escribir: " + e.getMessage());
        }
    }
}
