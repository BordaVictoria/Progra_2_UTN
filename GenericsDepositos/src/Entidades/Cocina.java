
package Entidades;


public class Cocina {
    private int codigo;
    private Boolean esIndustrial;
    private float precio;

    public Cocina(int codigo, float precio, Boolean esIndustrial) {
        this.codigo = codigo;
        this.esIndustrial = esIndustrial;
        this.precio = precio;
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
        final Cocina other = (Cocina) obj;
        return this.codigo == other.codigo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cocina{");
        sb.append("codigo=").append(codigo);
        sb.append(", esIndustrial=").append(esIndustrial ? "sí" : "no");
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
    
            
}
