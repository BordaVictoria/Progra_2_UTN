
package Entidades;

import java.util.ArrayList;

public class Juego {
//    ● Crear clase Juego.
//
//■ Atributos privados: titulo: String, pesoGB: double.
//■ Atributo protegido: consolasCompatibles: ArrayList<TipoConsola>
//■ Constructor que reciba un título y un pesoGB.
//■ Métodos getter para los atributos.
//■ Método mostrarJuego(): String: retornar valores del objeto.
//■ Método esCompatible(TipoConsola): Boolean : Devuelve true si es
//compatible con la consola recibida.
    
    private String titulo;
    private Double pesoGB;
    protected ArrayList<TipoConsolas>consolasCompatibles;

    public Juego(String titulo, Double pesoGB ) {
        this.titulo = titulo;
        this.pesoGB = pesoGB;
        this.consolasCompatibles = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public Double getPesoGB() {
        return pesoGB;
    }

    public ArrayList<TipoConsolas> getConsolasCompatibles() {
        return consolasCompatibles;
    }
    
    public String mostrarJuego(){
    StringBuilder sb = new StringBuilder();
    sb.append("Titulo: ").append(this.titulo).append("/n");
    sb.append("Peso : ").append(this.pesoGB).append(" GB");
   
    return sb.toString();
            
    }

    
}
