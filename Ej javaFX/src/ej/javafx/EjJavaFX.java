
package ej.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class EjJavaFX extends Application {

    @Override
    public void start(Stage stage) throws Exception {
    TextField txtnumeroUno = new TextField();
    TextField txtnumeroDos = new TextField();
    Button btnsumar = new Button("Sumar");
    Label lblresultado = new Label();
    txtnumeroDos.setMaxWidth(200);
    txtnumeroUno.setMaxWidth(200);
    btnsumar.setOnAction((t)->{
        try{
        Double numeroUno = Double.parseDouble(txtnumeroUno.getText());
        Double numeroDos = Double.parseDouble(txtnumeroDos.getText());
        double resultado = numeroUno+numeroDos;
        
        lblresultado.setText("Resultado = "+ resultado);
        }
        catch(NumberFormatException e ){
            lblresultado.setText("No se pudo realizar la operacion , ingresa un NUMERO porfavor");
        }    
    });
    
    VBox root = new VBox(10,txtnumeroUno,txtnumeroDos,btnsumar,lblresultado);
    root.setAlignment(Pos.CENTER);
    Scene scene = new Scene(root,400,200);
    
    stage.setScene(scene);
    
    stage.show();
        
    
    }

    
    public static void main(String[] args) {
    Application.launch();
    }
    
}
