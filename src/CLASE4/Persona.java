
package CLASE4;


public class Persona {
    public String nombre;
    public NivelEstudio nivelEstudio;
    
    
    public Persona(){
    this.nombre="";
    this.nivelEstudio=NivelEstudio.PRIMARIO;
    }
            
    public Persona(String nombre){
        
    /// para no hacer sobrecar se pone 
    this();// asi se llaman a los constructores
    // aca evitas la linea de estudio
    this.nombre= nombre;
    //this.nivelEstudio="Sin etudios";
     }
    public Persona(String nombre, NivelEstudio nivel){
    // con este evitas la linea de nombre     
    this(nombre);
    //this.nombre= nombre;
    this.nivelEstudio=nivel;
     }
    
    public String metodoSobrecargado(){
    
        
        return "";
    }
    
    public int metodoSobrecargado(int edad){
    
        return  edad;
    }
    /// eeeeeeeeeeeeeeeesto 
    // STRGINBUILDER
    public String mostrar(){
    
        StringBuilder sb = new StringBuilder();

        sb.append("nombre").append(this.nombre);
        sb.append("nivel ").append(this.nivelEstudio);
        sb.append("nivel ").append(this.nivelEstudio);
        
    
    return sb.toString();
    }
    
    
}
