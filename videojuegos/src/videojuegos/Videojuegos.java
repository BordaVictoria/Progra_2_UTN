
package videojuegos;
import Entidades.*;
import java.util.ArrayList;
public class Videojuegos {
    public static void main(String[] args) {
        ArrayList<TipoConsolas> consolas = new ArrayList();
        consolas.add(TipoConsolas.PC);
        consolas.add(TipoConsolas.PLAYSTATION);
                
        Juego j1 = new JuegoAccion("cod",34.6,consolas);
        Juego j2 = new JuegoAccion("c66d",1.0,consolas);
        Juego j3 = new JuegoAccion("ctd",20.0,consolas);
        
        Consola c1 = new Consola("consola de vic",TipoConsolas.PC,50.0);
        
        System.out.println(c1.agregarJuego(j1) );
        c1.agregarJuego(j2);
        c1.agregarJuego(j3);
        
        c1.mostarJuego();
        
        
        
        
    }
    
}
