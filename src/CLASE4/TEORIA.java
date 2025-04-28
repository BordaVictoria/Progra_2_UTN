
package CLASE4;

public class TEORIA {
    // tipo cantidad y orden de argumentos OJO 
    //SOBRECARRRGA
    public static void main(String[] args){
        
        //Persona p1 = new Persona("facu",NivelEstudio.TERCIARIO);
        
       // System.out.println( p1.mostrar());
//       palabras frase1= new palabras();
//       
//       frase1.mostardatos();

//        numeracion n1= new numeracion();
//        n1.numerador();

        Pedido p1 = new Pedido("juan",Bebidas.CAFE);
        
        System.out.println(p1.esBebidaFria());
        
//          Libro l1 = new Libro("100 añod de soledad","ggm",Genero.FICCION);
//          
//          System.out.println(l1.esGenero("Ficción"));
//        
    }
    
}
