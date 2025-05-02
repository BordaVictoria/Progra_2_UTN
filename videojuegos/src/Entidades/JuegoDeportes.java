
package Entidades;

import java.util.ArrayList;


public class JuegoDeportes extends Juego{
    
      public JuegoDeportes(String titulo, Double pesoGB,ArrayList<TipoConsolas> arrayconsolas) {
       super(titulo,pesoGB);
       super.consolasCompatibles = arrayconsolas;
    }
      
      
}
