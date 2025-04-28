/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASE3;

// tipo de dato estatico es de clase y es uno por clase 
// el tipo conexion BD es la clase que estoy creando 

public class ConexionBD {
    private static ConexionBD instancia;
    private String ConfiguracionConexion;
    
    
    ///ejemplo de bloqeu estatico
    // el bloque esttico se pone una sola vez y se ejecuta cunado sea 
    //que se interactua con la clase 
    static{
    ConexionBD.instancia=null;
    
    }
    
    
    private ConexionBD(){
        System.out.println("conexion creada ");
        this.ConfiguracionConexion="configurado";

    }
    public static ConexionBD getInstancia(){
    
        if(instancia == null){
           instancia = new ConexionBD(); 
        }
        
        return instancia;
    }
    
    public void conectar(){
        System.out.println("conectado");
    }

}
