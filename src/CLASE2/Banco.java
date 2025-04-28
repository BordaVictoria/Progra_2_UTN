//Crear una clase Banco con un atributo estático saldoTotal y métodos estáticos
//depositar(int monto) y extraer(int monto).
//
//● depositar(int monto): acumula el saldo con el
//parámetro recibido.
//● extraer(int monto): resta el saldo con el parámetro recibido.
//
//Nota: No se puede restar saldo negativo.
package CLASE2;

public class Banco {
    double saldo_total;
    
    public void Depositar(double ingreso){
        
        if (ingreso<0){
            System.out.println("No puede ingresar dinero negativo , llame a la funcion extraer");
        }else{
        saldo_total += ingreso;
        Mostrar();
        }                         
    }
    public void Extraer(double egreso){
        
        if (saldo_total<egreso){
            System.out.println("No tiene fondos suficientes, le queda en cuenta : "+ saldo_total);
        }else{
        saldo_total-= egreso;
        Mostrar(); 
        }
    }
    public void Mostrar(){
        System.out.println("Su cuenta tiene : " + saldo_total);
    }
    
    
}
