
package CLASE4;

import java.util.Scanner;

public class palabras {
        public void mostardatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase : ");
        String frase = sc.nextLine();
        System.out.println("Cantidad de carateres: " + cantidadCaracteres(frase));
        System.out.println("Cantidad Palabras = " + this.cantidadPalabras(frase));
        System.out.println("Palabra en Mayuscula : "  +this.palabrasMayuscula(frase)); 
        System.out.println("Palabra en minuscula: " + this.palabrasMinuscula(frase));
        System.out.println(this.encontrarJava(frase));    
        
        
    }
    
    private int cantidadCaracteres(String frase){
    int contador = frase.length();
   
        return contador;
    }
    public int cantidadPalabras(String frase){
       int contador= 0;
       String[] array = frase.split(" ");
        
       for (String palabra: array){
            contador ++;
       }
        return contador;
       }
    
    public String palabrasMayuscula(String frase){
         frase = frase.toUpperCase();
        
    return frase;
    }   
    public String palabrasMinuscula(String frase){
         frase = frase.toLowerCase();
        
    return frase;
    }
    
    public String encontrarJava(String frase){
    String[] array = frase.split(" ");
    String mensaje = "La frase no contiene Java ";
       for (String palabra: array){
            if ("java".equalsIgnoreCase(palabra)){
                mensaje = "La frase contiene java";
            }
       }
    return mensaje;
    }
}


