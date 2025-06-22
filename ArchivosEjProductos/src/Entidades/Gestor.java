/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author borda
 */
public class Gestor implements IArchivable{
    private ArrayList<Producto> productos;


    public Gestor(){
    this.productos = new ArrayList<>();
    
    }
    @Override
    public void cargar(String path) {
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                
                Producto p = (Producto) new Producto().fromCSV(linea);
                this.productos.add(p);
            }
         
        } catch (IOException  e) {
            System.err.println("Error al leer el CSV: " + e.getMessage());
        }
    }
    

    @Override
    public ArrayList<Producto> buscarPorCategoria(String categoria) {
        ArrayList<Producto> busqueda = new ArrayList<>();
        for (Producto producto : productos) {
            if(producto.getCategoria().equals(categoria)){
            busqueda.add(producto);
            }
        }
    this.guardarTXT("CODIGO; STOCK; NOMBRE; CATEGORIA;PRECIO", categoria);
    return busqueda;
    }

    @Override
    public void guardarTXT(String Encabezado,String categoria) {
        String desktopPath = System.getProperty("user.home") + File.separator + "Desktop";
        
        File archivoSalida = new File(desktopPath+"/busqueda.txt");


        try (
            BufferedReader lector = new BufferedReader(new FileReader("datos.csv"));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoSalida))
        ) {
            String linea;
            String header = Encabezado;
            escritor.write(header);
            escritor.newLine();
            while ((linea = lector.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos[3].equals(categoria)){
                
                        String procesada = linea.toUpperCase();
                        escritor.write(procesada);
                        escritor.newLine();
                    }
                }
            System.out.println("Archivo procesado con éxito.");
        } catch (IOException e) {
            System.err.println("Error al leer o escribir: " + e.getMessage());
        }
    }
    
    
}
