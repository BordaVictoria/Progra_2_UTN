
package CLASE4;


public enum NivelEstudio {
    PRIMARIO("cursando"),
    SECUNDARIO("cursando"),
    TERCIARIO("cursando"),
    UNIVERSITARIO("cursando");
private String descripcion;

private NivelEstudio(String descripcion){
    this.descripcion=descripcion;
    
}
public String getDescripcion(){
    
        return this.descripcion;
}

}

