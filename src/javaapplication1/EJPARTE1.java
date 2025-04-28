/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author borda
 */
public class EJPARTE1 {
    
    
     public static void main(String[] args)
     {
        //ej1();
        //ej2();
        //ej3();
        //ej4();
        //ej5();
    }
    
    
      public static void ej1(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("INGRESE su edad : " );
        int numero = scanner.nextInt();
        // aca no me deja ingresar el nombre , porque el next int
        // no te toma el enter y queda en e lbuffer
        // entonces lo toma el nombre 
        // para evitarlo hago 
        
        scanner.nextLine();// como que limpio el buffer 
        
      
        System.out.println("ingrese su bombre = ");
        String nombre = scanner.nextLine();
        
        System.out.println("edad = " + numero+ " Nombre: " + nombre);
      
        }
        public static void ej2(){
        Scanner scanner = new Scanner(System.in);
        	System.out.println("Ingrese un numero: ");
		int numero = scanner.nextInt();
		if (numero>0) {
		    For(numero);
		}else{
                    System.out.println("el numero que ingreso es menor a 0 nosotros mostramos de 1 a n gil");}
		
	}
	
	public static void For(int numero){
	    System.out.println("Los numero pares son ");		    
            for(int i=1;i<=numero;i++)
		{
                    if (i%2 == 0){
		        System.out.println(i); 
		    }
		}
	}
        public static void ej3(){
        Scanner scanner = new Scanner(System.in);
        	System.out.println("Ingrese un numero: ");
		int numero = scanner.nextInt();
                System.out.println("Ingrese otro numero: ");
		int numero_dos = scanner.nextInt();
                
                if (numero % numero_dos == 0){
                System.out.println("El primer numero es multiplo del otro");
                }else{
                System.out.println("El primero no es multiplo del seg");
                }
        }
        public static void ej4(){
        Scanner scanner = new Scanner(System.in);
         	System.out.println("Ingrese un numero: ");
                int numero = scanner.nextInt();
                for(int i=1;i<=10;i++){
                    int resultado = i*numero;
                    System.out.println(i+ " X "+ numero +" = " + resultado); 
                    
                }
        }
        public static void ej5(){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese su nombre y apellido");
            String nombre = scanner.nextLine();
            System.out.println("INGRESE SU PRIMER NOTA: ");
            int nota_uno = scanner.nextInt();
            System.out.println("INGRESE SU SEGUNDA NOTA: ");
            int nota_dos = scanner.nextInt();
            System.out.println("INGRESE SU TERCER NOTA: ");
            int nota_tres = scanner.nextInt();
            
            int resultado = (nota_uno+nota_dos+nota_tres)/3;
            
            if  (resultado<4){
                System.out.println("buu"+nombre +"Desaprobaste perro");
            }else if(resultado<6){
                System.out.println("bueni" + nombre + "Aprobaste pero no promosionaste meh ");
            }else{
                System.out.println("VAMOS" +nombre + "PROMOCIONADO GATITO");
            }
                               
                    
        }
}
