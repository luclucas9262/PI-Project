package javafxapplication1;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class tela extends Application {

    
    private static Scene scene;
    
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
            Parent scrollPane = loader.load();
            
            // scrollPane.setFitToHeight(true);
            // scrollPane.setFitToWidth(true);
            // Classe da tela
            scene = new Scene(scrollPane);
            // Titulo da tela
            stage.setTitle("[PROTOTIPO] Login");
            // Define a tela que ira mostrar
            stage.setScene(scene);
            // Mostra a tela
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static Scene getMainScene(){
        return scene;
    }
    
}
