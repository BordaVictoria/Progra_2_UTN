
package CLASE4;


public class Pedido {
    private String cliente;
    private Bebidas bebidaElegida;

    public Pedido(String cliente, Bebidas bebidaElegida) {
        this.cliente = cliente;
        this.bebidaElegida = bebidaElegida;
    }

    
    
    public boolean esBebidaFria(){

        return bebidaElegida.getTemperatura() == "fria";
    
    }
    
}
