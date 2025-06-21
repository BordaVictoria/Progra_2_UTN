/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author borda
 */
public class Contabilidad <T,U extends Documento>{
  private ArrayList<T> egresos;
  private ArrayList<U> ingresos;

  public Contabilidad(){
  this.egresos = new ArrayList();
  this.ingresos = new ArrayList<>();
  }
  
  public static <T extends Documento> void agregarEgreso(Contabilidad c , T t ){
      c.egresos.add(t);
  };
  
  public static <U extends Documento> void agregarIngreso(Contabilidad c , U u ){
  c.ingresos.add(u);
  };
  
  public void mostrarIngresos(){
      for (U Ingreso : ingresos) {
          System.out.println(Ingreso.toString() );
      }
  }
  
  public void mostrarEgreso(){
      for (T egreso : egresos) {
          System.out.println(egreso.toString() );
      }
  }
}
