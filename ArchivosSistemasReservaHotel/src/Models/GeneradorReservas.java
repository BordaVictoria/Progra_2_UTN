
package Models;

import java.util.ArrayList;


public interface GeneradorReservas {
    ArrayList<Reserva> leerReservas(String path);
    boolean generarResumenPorCliente(Cliente c);
    void guardarResumen(String Paht);
    
}
