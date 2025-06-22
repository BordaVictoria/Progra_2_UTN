
package archivosejproductos;

import Entidades.Gestor;


public class ArchivosEjProductos {


    public static void main(String[] args) {
        Gestor g = new Gestor();
        
        g.cargar("datos.csv");
        
        g.buscarPorCategoria("Accesorios");

    }
    
}
