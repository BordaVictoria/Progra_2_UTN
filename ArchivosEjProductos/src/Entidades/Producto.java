
package Entidades;


public class Producto implements ISerialisableCSV {
    private int codigo,stock;
    private String nombre ,categoria;
    private Double precio;
    
    public Producto(){};
    public Producto(int codigo, int stock, String nombre, String categoria, Double precio) {
        this.codigo = codigo;
        this.stock = stock;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getStock() {
        return stock;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    @Override
    public String toCSV() {
    StringBuilder sb= new StringBuilder();
    sb.append(this.codigo).append(",");
    sb.append(this.stock).append(",");
    sb.append(this.nombre).append(",");
    sb.append(this.categoria).append(",");
    sb.append(this.precio).append(",");
    
    return sb.toString();
    }

    @Override
    public ISerialisableCSV fromCSV(String data) {
    String[] linea = data.split(",");
     int codigo = Integer.parseInt(linea[0]);
     int stock = Integer.parseInt(linea[1]);
     String nombre = linea[2];
     String categoria = linea[3];
     double precio = Double.parseDouble(linea[4]);
     
     Producto p = new Producto(codigo,stock,nombre,categoria,precio);
    
     return p;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return this.codigo == other.codigo;
    }
    
    
}
