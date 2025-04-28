
package CLASE4;

public class Calculadora {
    
    
    public int sumar(int numero1,int numero2){
        return numero1+numero2;
    }
    
    public double sumar(double numero1, double numero2){
        double resultado = numero1+numero2;
        return resultado;
    }
    
    public int sumar(int numero1 , int numero2,int numero3){
        
        return sumar(numero1,numero2)+numero3;           
    }
    
    public String sumar(String primero,String segundo){
    
    return primero+segundo;
    }
}
