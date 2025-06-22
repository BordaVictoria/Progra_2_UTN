
package Entidades;

import java.util.ArrayList;


public class Empresa <T extends Empleado>{
    private ArrayList<T> empleados;
    private CSVUtils herramientaCSV;
    private ArchivoTXTUtils herramientaArchivo;
    
    public Empresa(){
    this.empleados = new ArrayList();
    this.herramientaCSV= new CSVUtils<ISerialisableCSV>();
    this.herramientaArchivo = new ArchivoTXTUtils();
    }
    
    public void agregar(T empleado){
    this.empleados.add(empleado);
    }
    
    public void eliminar(T empleado){
        if(this.empleados.contains(empleado)){
        this.empleados.remove(empleado);
            System.out.println("Empleado" + empleado.toString()+" ELIMINADO ");
        }
    }
    
    public void leerCSV(){
    ArrayList<String> lineas = this.herramientaCSV.leerCSV();
        for (String elemento: lineas) {
            String[] linea = elemento.split(",");
            Empleado empleado = null;
            switch (linea[0]) {
                case "TIEMPOCOMPLETO"-> empleado = (Empleado) new EmpleadoTiempoCompleto().fromCSV(elemento);
                
                case"MEDIOTIEMPO"-> empleado = (Empleado) new EmpleadoMedioTiempo().fromCSV(elemento);
                
            }
            if(empleado!=null ){
                this.empleados.add((T) empleado);
            }
                   
        }
                
    }
    
    public void escribirCSV(){
    this.herramientaCSV.escribirCSV(this.empleados);
    }
    
    public void generarInforme(){
    this.herramientaArchivo.crearArchivo("datos.CSV","informe.txt"," TIPO EMPLEADO ; NOMBRE; SUELDO BASE ; HORAS EXTRAS; SUELDO TOTAL");
    }
}
