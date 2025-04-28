
package CLASE2;

//Crear una clase Estadisticas que contenga métodos estáticos: metodoA(),
//metodoB(), metodoC() y mostrarResumen().
//
//● mostrarResumen(): Muestra en pantalla cuantas
//veces se llamaron a los distintos métodos
//anteriores (A,B,C).
public class Estadisticas {
    int contador1;
    int contador2;
    int contador3;
    
    public void metodoA(){
        contador1+=1;
    }
    public void metodoB(){
        contador2++;
    }
    public void metodoc(){
        contador3++;
    }
    public void mostrarResumen(){
        System.out.println("El metodo a se uso " + contador1);
        System.out.println("El metodo b se uso " + contador2);
        System.out.println("El metodo c se uso " + contador3);
    
    }
    
}
