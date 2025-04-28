
package CLASE4;


public enum Genero {
    FICCION("Ficción"),
    POESIA("Poesía"),
    ENSAYO("Ensayo"),
    INFANTIL("Literatura Infantil");
    
    private String decripcion;
    
    private Genero(String descripcion){
    this.decripcion =descripcion;
    
    }
    
    public String getDescripcion(){
    return this.decripcion;
    }
    
    
}
