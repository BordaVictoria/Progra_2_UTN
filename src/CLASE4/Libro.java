
package CLASE4;


public class Libro {
   private String nombre;
   private String autor;
   private Genero genero;

    public Libro(String nombre, String autor, Genero genero) {
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
    }
   
   
   public boolean esGenero(String genero ){
   return genero == this.genero.getDescripcion();
   }
}
