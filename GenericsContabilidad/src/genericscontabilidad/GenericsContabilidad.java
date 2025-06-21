/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericscontabilidad;

import Entidades.*;
public class GenericsContabilidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              // Crear una contabilidad que maneja Recibos como egresos y Facturas como ingresos
        Contabilidad<Recibo, Factura> contabilidad = new Contabilidad<>();

        // Crear documentos
        Recibo recibo1 = new Recibo();
        Recibo recibo2 = new Recibo(101);

        Factura factura1 = new Factura(200);
        Factura factura2 = new Factura(201);

        // Agregar a la contabilidad
        Contabilidad.agregarEgreso(contabilidad, recibo1);
        Contabilidad.agregarEgreso(contabilidad, recibo2);

        Contabilidad.agregarIngreso(contabilidad, factura1);
        Contabilidad.agregarIngreso(contabilidad, factura2);

        // Mostrar resultados
        contabilidad.mostrarEgreso();
        contabilidad.mostrarIngresos();
    }
    
}
