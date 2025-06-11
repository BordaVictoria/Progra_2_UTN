/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javafxscenebuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author borda
 */
public class JavafxSceneBuilder extends Application {

    @Override
    public void start(Stage stage) throws Exception {
     FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/view.fxml"));
     Scene scene = new Scene(loader.load());
     stage.setScene(scene);
     stage.show();
    }

   
    public static void main(String[] args) {
      Application.launch(args);
    }
    
}
