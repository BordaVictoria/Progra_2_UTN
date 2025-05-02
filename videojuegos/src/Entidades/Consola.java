
package Entidades;

import java.util.ArrayList;

/**
● Crear clase Consola.

■ Atributos privados: nombre:String, tipo: TipoConsola, capacidadMaximaGB:
double, juegosInstalados: ArrayList<Juego>.
■ Constructor que reciba nombre, tipo y capacidadMaximaGB.
■ Método agregarJuego(Juego): Boolean : Permite agregar un juego sólo si es
compatible y si hay espacio.
■ Método mostrarJuegos(): int : Muestra los juegos instalados.
 */
public class Consola {
    private String nombre;
    private TipoConsolas tipo;
    private Double capacidadMAximaGB;
    private ArrayList<Juego> juegosInstalados;
    private Double capacidadDisponible;

    public Consola(String nombre, TipoConsolas tipo, Double capacidadMAximaGB) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidadMAximaGB = capacidadMAximaGB;
        this.capacidadDisponible=this.capacidadMAximaGB;
        this.juegosInstalados = new ArrayList();
    }
    
    public boolean agregarJuego(Juego juego){
    boolean flag = false;
   
        if (juego.getPesoGB()<this.capacidadDisponible & juego.getConsolasCompatibles().contains(tipo)){
            juegosInstalados.add(juego);
            this.capacidadDisponible = this.capacidadDisponible-juego.getPesoGB();
            flag = true;
        }
      
       return flag;
    }
    
    public void mostarJuego(){
        
            System.out.println("Juegos INSTALADOS  = ");
        for (Juego juegos : juegosInstalados) {
            System.out.println(juegos.mostrarJuego());
            System.out.println("");
        }
    
    }
    
    
}
