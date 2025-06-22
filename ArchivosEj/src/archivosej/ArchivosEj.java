/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivosej;

import Entidades.Empleado;
import Entidades.EmpleadoMedioTiempo;
import Entidades.EmpleadoTiempoCompleto;
import Entidades.Empresa;

/**
 *
 * @author borda
 */
public class ArchivosEj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               // Crear una empresa
        Empresa<Empleado> empresa = new Empresa<>();

        // Crear empleados
        EmpleadoMedioTiempo emp1 = new EmpleadoMedioTiempo("Juan Perez", 1000, 5);
        EmpleadoTiempoCompleto emp2 = new EmpleadoTiempoCompleto("Ana Gomez", 2000, 10);

        // Agregar empleados
        empresa.agregar(emp1);
        empresa.agregar(emp2);

        // Escribir en CSV
        empresa.escribirCSV();

        empresa.leerCSV();

        // Generar informe
        empresa.generarInforme();

        System.out.println("Prueba completada.");
    }
    
}
