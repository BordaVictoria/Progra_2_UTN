/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author borda
 */
public class PeliculaDrama extends Pelicula implements IAlquilable{
    private GeneroDrama tipoDrama;

    public PeliculaDrama( String titulo, double precio, String nombre, String Apellido, String DNI,GeneroDrama tipoDrama) {
        super(titulo, precio, nombre, Apellido, DNI);
        this.tipoDrama = tipoDrama;
    }

    @Override
    public double getPrecioAlquiler() {
    double valoralqui = this.precio ;
        switch (tipoDrama) {
            case HISTÓRICO:
                valoralqui=this.precio*1.5;
                       
                break;
            case ROMÁNTICO:
                valoralqui=this.precio*1.4;
                       
                break;
            case SOCIAL:
                valoralqui=this.precio*1.2;
                break;    
            default:
                throw new AssertionError();
        }
     return valoralqui;
    }
    
    @Override
    public boolean equals(Object obj){
    if(obj instanceof PeliculaDrama){
        if(this.tipoDrama ==((PeliculaDrama) obj).tipoDrama &&  super.equals(obj)){
            return true;
        }
    }
    return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Tipo Drama").append(this.tipoDrama);
        return sb.toString();
    }
    
    
    
}
