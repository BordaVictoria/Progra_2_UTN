
package Entidades;



public class PeliculaAccion extends Pelicula implements IAlquilable{
    private GeneroAccion tipoAccion;

    public PeliculaAccion(String titulo, double precio, Director director,GeneroAccion tipoAccion) {
        super(titulo, precio, director);
        this.tipoAccion= tipoAccion;
    }

    @Override
    public double getPrecioAlquiler() {
            double valoralqui = this.precio ;
        switch (this.tipoAccion) {
            case AVENTURA:
                valoralqui=this.precio*1.4;
                       
                break;
            case BELICA:
                valoralqui=this.precio*1.3;
                       
                break;
            case SUPERHEROES:
                valoralqui=this.precio*1.5;
                break;    
            default:
                throw new AssertionError();
        }
     return valoralqui;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Tipo Accion: ").append(this.tipoAccion);
        return sb.toString();
    }
    
    
        @Override
    public boolean equals(Object obj){
    if(obj instanceof PeliculaAccion){
        if(this.tipoAccion ==((PeliculaAccion) obj).tipoAccion &&  super.equals(obj)){
            return true;
        }
    }
    return false;
    }
    
    

    
    
    
    
    
}
