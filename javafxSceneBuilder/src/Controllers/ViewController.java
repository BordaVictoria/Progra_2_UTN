/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controllers;

import Models.Persona;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class ViewController implements Initializable {
    
    
    @FXML
    private ListView<Persona> listViewPersonas;
    
    
    @FXML
    private Button btnAgregar;
    
    @FXML
    private Button btnModificar;
    @FXML
    private Button btnEliminar;
    
    private List<Persona> listaPersonas;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       this.listaPersonas = new ArrayList();
    }    
    
    @FXML
    private void agregarPersona(ActionEvent a ){
        this.abrirFormulario(null);
    }
    
    @FXML
    private void modificarPersona(ActionEvent a ){
        
      Persona personaSeleccionada = this.listViewPersonas.getSelectionModel().getSelectedItem();
      if(personaSeleccionada != null){
        this.abrirFormulario(personaSeleccionada);
      }
    }
    @FXML
    private void eliminarPersona(ActionEvent a ){
        Persona personaSeleccionada = this.listViewPersonas.getSelectionModel().getSelectedItem();
        if (personaSeleccionada != null ){
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setHeaderText("esta seguro que quiere eliminar ?");
        alerta.setContentText(personaSeleccionada.toString());
        
        Optional<ButtonType> resultado = alerta.showAndWait();
        
        if(resultado.isPresent() && resultado.get() == ButtonType.OK){
            this.listaPersonas.remove(personaSeleccionada);
        }
        
        
        }
    }
    
    private void actuarlizarListView(){
    this.listViewPersonas.getItems().clear();
    this.listViewPersonas.getItems().addAll(this.listaPersonas);
    }
    
    private void abrirFormulario(Persona persona){
    
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/formulario.fxml"));
            // SCENA SE CARGA ANTES 
            Scene scene = new Scene(loader.load());
            FormularioController controller = loader.getController();
            
            controller.setPersona(persona);// esto llama a los metodos del form
            
            
           
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            Persona resultado = controller.getPersona();
            if(resultado != null){
                
                if(persona == null){
                
                    if(!(this.listaPersonas.contains(resultado))){
                        this.listaPersonas.add(persona);
                    }else{
                        System.out.println("La persona existe ");
                    }
                }
            }
            
            this.actuarlizarListView();
        } catch (Exception e) {
            
        }
    }
}
