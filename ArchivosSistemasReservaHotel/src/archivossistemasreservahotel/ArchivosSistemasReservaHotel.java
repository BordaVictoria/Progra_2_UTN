
package archivossistemasreservahotel;

import Models.Cliente;
import Models.Hotel;
import javax.imageio.plugins.tiff.ExifTIFFTagSet;


public class ArchivosSistemasReservaHotel {


    public static void main(String[] args) {
        Hotel h = new Hotel();
        Cliente c = new Cliente("Juan Perez");
        h.leerReservas("datos.txt");
        
        h.generarResumenPorCliente(c);
        if(h.generarResumenPorCliente(c)){
        h.guardarResumen("juanperez.txt");
        }
    }
    
}
