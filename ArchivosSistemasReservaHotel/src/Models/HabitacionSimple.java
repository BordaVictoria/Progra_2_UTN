
package Models;


public class HabitacionSimple extends Habitacion {
    private TipoHabitacion tipo ;

    public HabitacionSimple( int numero,TipoHabitacion tipo) {
        super(numero);
        this.tipo = tipo;
        this.setPrecio();
    }

    @Override
    public void setPrecio() {
    super.precio = super.precio*1.1;
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }
    
    
}
