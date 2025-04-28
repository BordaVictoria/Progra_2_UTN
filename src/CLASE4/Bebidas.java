
package CLASE4;

public enum Bebidas {
    CAFE("Café","caliente"),
    TE("té","caliente"),
    JUGO("Jugo","fria"),
    AGUA("Agua","fria"),
    GASEOSA("Gaseosa","fria");
    
    private String nombre;
    private String temperatura;
    
    private Bebidas(String nombre,String temperaturas)
    {
        this.nombre=nombre;
        this.temperatura = temperaturas;
    }
    
    public String getNombre(){
    return this.nombre;
    }
    
    public String getTemperatura(){
    return this.temperatura;
    }

}
