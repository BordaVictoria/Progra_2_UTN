
package CLASE3;

/**
 f7 te saltea lineas y f8 te saltea metodos 
 * para debugear
 */
public class CLASE3 {
      public static void main(String[] args)
    {
    
        Vehiculo v1 = new Vehiculo("hio", "holi", 0);
    // con este de vehiculo puedo crear todosl os vehicuos q queir
    
        System.out.println(v1.mostrar());
        
        
        ConexionBD con1 = ConexionBD.getInstancia();
        // scon este metodo queda una instancia sola no me importa
        // cuantos objetos cree 
        con1.conectar();
        
        
        
    }
}
