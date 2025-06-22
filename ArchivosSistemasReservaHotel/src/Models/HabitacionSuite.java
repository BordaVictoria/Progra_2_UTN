
package Models;


public class HabitacionSuite extends Habitacion{
    TipoHabitacion tipo;

    public HabitacionSuite(TipoHabitacion tipo, int numero) {
        super(numero);
        this.tipo = tipo;
        this.setPrecio();
    }

    @Override
    public void setPrecio() {
    super.precio = super.precio*1.5;
    }
    
    
}
