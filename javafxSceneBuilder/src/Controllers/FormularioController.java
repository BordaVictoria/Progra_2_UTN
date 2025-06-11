
package Controllers;

import Models.Persona;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class FormularioController  {
    
    @FXML 
    private Button btnConfirmar;
 
    @FXML 
    private Button btnCancelar;
    
   
    @FXML 
    private TextField txtId;
    
    
    @FXML 
    private TextField txtNombre;
    
    
    @FXML 
    private TextField txtApellido;
    
    
    private Persona persona;
    
    private boolean confirmado;
    
    
    public Persona getPersona(){
     return this.confirmado?this.persona:null;
    }
    
    public void setPersona(Persona persona){
    
        this.persona = persona;
        
        if(persona != null){
            this.txtId.setText(String.valueOf(persona.getId()));
            this.txtApellido.setText(persona.getApellido());
            this.txtNombre.setText(persona.getNombre());
            
        }
        
    }
    
    @FXML 
    private void confirmar(){
        String id = this.txtId.getText().trim();
        String nombre = this.txtNombre.getText().trim();
        String apellido = this.txtApellido.getText().trim();
        
        if (id.isEmpty()||nombre.isEmpty()||apellido.isEmpty()){
            System.out.println("Campos obligatorios" );
            return;
        
        }
        
        int idInt = Integer.parseInt(id);
        if(this.persona == null){
        this.persona = new Persona(nombre,apellido,idInt);
        }else{
        this.persona.setApellido(apellido);
        this.persona.setId(idInt);
        this.persona.setNombre(nombre);
        }
        
        this.confirmado=true;
        this.cerrarVentana();
        
    }
    
    @FXML 
    private void cancelar(){
    this.cerrarVentana();
    }
    
    private void cerrarVentana(){
    Stage stage = (Stage) btnCancelar.getScene().getWindow();
    
    stage.close();
    }
}
