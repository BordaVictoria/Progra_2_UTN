
package Entidades;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class CSVUtils<T extends ISerialisableCSV> {
    
    public void escribirCSV(ArrayList<T> lista)
    {
        String archivoCsv = "datos.csv";

        // Escribir encabezado + datos
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoCsv))) {
          
            
            for (T item : lista){
            bw.write(item.toCSV());
            bw.newLine();
            }
            
        } catch (IOException e) {
            System.err.println("Error al escribir el CSV: " + e.getMessage());
        }
    }

        public ArrayList<String> leerCSV() {
        ArrayList<String> lista = new ArrayList<>(); 
        try (BufferedReader br = new BufferedReader(new FileReader("datos.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lista.add(linea);
                }
         
        } catch (IOException  e) {
            System.err.println("Error al leer el CSV: " + e.getMessage());
        }
        return lista;
    }
}
