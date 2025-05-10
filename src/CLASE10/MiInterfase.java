
package CLASE10;


public interface MiInterfase {
    int CONSTANTE = 5;
    // todos los metodos son publicos 
    void metodo();
    
    default void metodoPorDefecto(){
        System.out.println("tiene implementacion = " );
    }
}
