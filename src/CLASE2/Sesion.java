//5) Crear una clase Sesion con un atributo estático usuarioLogueado:String y
//métodos estáticos para iniciar y cerrar sesión, además de mostrar el estado actual.
//
//● login(String usuario).
//● logout().
//● mostrarEstado().
//
//Nota: Usuario deslogueado tiene valor null.
package CLASE2;

public class Sesion {
    String usuarioLogueado = null;
    
    public void Login(String usuario){
       if(usuarioLogueado==null){
           usuarioLogueado= usuario;
           Mostrar();
       }else{
           System.out.println("No puede loguear dos ususarios a la vez,desconectese" );
       }
    }
    public void logout(){
        usuarioLogueado = null;
    }
    
    public void Mostrar(){
        if(usuarioLogueado == null){
            System.out.println("No hay usuario logueado");
        }else{
        System.out.println("El usario logueado es " + usuarioLogueado);
        }
    }
}
