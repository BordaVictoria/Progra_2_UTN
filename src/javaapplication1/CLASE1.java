
package javaapplication1;

import java.util.Scanner;


public class CLASE1 {
    int edad = 25; // se declaran las variable (int) es entero
    final static double PI = 3.14;// constante 
    
    
    public static void main(String[] args)
    {
        /*double numerodoble = 5.9;
        
        int Numeroentero = (int) numerodoble; // pones int para castear el tipo
        //de dato OJOOOO que no te redondea un choto , solo elimina dec 
        
        
        System.out.println(Numeroentero);
        ALgo();*/
        //ej1();
        //ej2();
        //ej3();
        //ej4();
        //ej5();
    }
    
    public static void ALgo()
    {
        System.out.println(PI + " no vale 5");// el + concatena 
    
       int i =1;
    // el do while siempre entra la primera 
    do {
    
        System.out.println("i = " + i);
     
        i++;
     }while (i<5);
    
    // ENTRADA DE DATOOOOSSS
    // SALIDA CON EL PRINT
    
    Scanner scanner = new Scanner(System.in);
    
        System.out.println("INGRESE su edad : " );
        int numero = scanner.nextInt();
        // aca no me deja ingresar el nombre , porque el next int
        // no te toma el enter y queda en e lbuffer
        // entonces lo toma el nombre 
        // para evitarlo hago 
        
        scanner.nextLine();// como que limpio el buffer 
        
        /// ooo 
          // int edad = Integer.parseInt(scanner.nextLine());
        System.out.println("ingrese su bombre = ");
        String nombre = scanner.nextLine();
        
        System.out.println("edad = " + numero+ " Nombre: " + nombre);
    
    }
      
   }


