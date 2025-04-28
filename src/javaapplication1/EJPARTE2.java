
package javaapplication1;

import java.util.Scanner;


public class EJPARTE2 {
    public static void main(String[] args)
    {
       //ej6();
       //ej7();
       //ej8();
       //ej9();
        ej10();
    }
    
    
    
    public static void ej6(){
    Scanner scanner = new Scanner(System.in);
        /*Ingresar una hora (de 0 a 23) y mostrar:
● "Buenos días" si está entre 6 y 12.
● "Buenas tardes" si está entre 13 y 20.
● "Buenas noches" si está entre 21 y 5.*/
    System.out.println(" Ingrese una hora :");
        int hora = scanner.nextInt();
    if (hora> 24 || hora< 0 ){
        System.out.println("Porfavor ingrese un numero entre 0 y 24");
    } 
    else{
    if (hora <= 5 || hora>=21){
        System.out.println("Buenas noches ");
    }else if (hora<=20 && hora >= 13){
        System.out.println("Buenas Tardes");}
    else{
        System.out.println("Buenos dias");
    }
    }    
    }
    
    public static void ej7(){
    Scanner scanner = new Scanner(System.in);
            /*Pedir al usuario una edad y un ingreso mensual.
Mostrar si es apto para un crédito, sólo si:
● La edad es mayor o igual a 21
● Y el ingreso supera los $150,000*/
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        if (edad >=21){
            System.out.println("¿Cuanto es su ingreso mensual?: ");
            int ingreso = scanner.nextInt();
            if (ingreso > 150000){
                System.out.println("Usted es apto para un credito");}
            else{
                System.out.println("No tiene los ingresos suficientes" );
            }
        }else{
            System.out.println("No esta apto por falta de edad" );}
        
    }
    
    public static void ej8(){
        //Pedir diez números enteros al usuario y determinar cuál es el mayor, cuál es menor y sacar el promedio.
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        for(int i = 10; i>0 ;i--){
            System.out.println("Ingrese un numero , le quedan " + i + " de 10");
            int numero = scanner.nextInt();
            suma += numero;
            if (numero > maximo){
                maximo = numero;
            }
            if (numero < minimo){
                minimo = numero;    
            }    
        }
        int promedio = suma / 10 ;
        System.out.println("el promedio es: " + promedio );
        System.out.println("El maximo es = " + maximo);
        System.out.println("El minimo es = " + minimo);
       
        
    }
    
    public static void ej9(){
      Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE UNA LETRA: ");
		String letra = scanner.nextLine();
		switch (letra){
		    case "a" :
		    case "e" : 
		    case "i" : 
		    case "o" :
		    case "u" :
                        System.out.println("Es una vocal");
                        break;
                    default:
                        System.out.println("Es una consonante "); 
                        break;
		        
		}
	}
    public static void ej10(){
        Scanner scanner = new Scanner(System.in);
        
		System.out.println("INGRESE UN NUMERO : ");
		
		int numero = scanner.nextInt();
		
		
		while (numero <2){
                System.out.println("INGRESE UN NUMERO mayor a 1 porfavor: ");
		
		numero = scanner.nextInt();
		
                }
		for(int i = 0 ;i < numero ;i++){  
		    for (int j = 0; j < numero; j++){
                     if(i==0 || j==0|| i==(numero-1)|| j ==(numero-1)){   
		     System.out.print("*");
                    }else{
                         System.out.print(" ");}    
		    }
                    System.out.println(" ");
                }
                
}
   
    
}
