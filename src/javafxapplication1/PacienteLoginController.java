/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafxapplication1;

import db.DB;
import gui.util.Constraints;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Pc
 */
public class PacienteLoginController implements Initializable {

    @FXML
    private TextField nome;
    @FXML
    private TextField cfpid;
    @FXML
    private TextField cepid;
    @FXML
    private TextField emailid;
    @FXML
    private TextField rgid;
    @FXML
    private TextField orgaoid;
    @FXML
    private TextField dataid;
    @FXML
    private RadioButton mascid;
    @FXML
    private ToggleGroup radioSex;
    @FXML
    private RadioButton femid;
    @FXML
    private TextField ruaid;
    @FXML
    private TextField cidadeid;
    @FXML
    private TextField numberid;
    @FXML
    private TextField estadoid;
    @FXML
    private TextField bairroid;
    @FXML
    private TextField compid;
    @FXML
    private TextField telid;
    @FXML
    private MenuButton civilid;
    @FXML
    private Button botao;
    @FXML
    private PasswordField passwordId;

    private Stage stage;
    private static Scene scene;
    
    Connection conn = DB.getConnection();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Constraints.setTexFieldCharacter(nome);
        Constraints.setTexFieldCharacter(ruaid);
        Constraints.setTexFieldCharacter(cidadeid);
        Constraints.setTexFieldCharacter(estadoid);
        Constraints.setTexFieldCharacter(bairroid);
        Constraints.setTexFieldCharacter(compid);
        Constraints.setTextFieldDouble(cfpid);
        Constraints.setTextFieldDouble(cepid);
        Constraints.setTextFieldDouble(rgid);
        Constraints.setTextFieldDouble(dataid);
        Constraints.setTextFieldDouble(numberid);
        Constraints.setTextFieldDouble(telid);
        Constraints.setTextFieldDouble(passwordId);
    }    

    @FXML
    private void onRadioSexAction(ActionEvent event) {
    }

    @FXML
    private void onsolteiroAction(ActionEvent event) {
    }

    @FXML
    private void oncasadoAction(ActionEvent event) {
    }

    @FXML
    private void onBotaoAction(ActionEvent event) throws IOException {
         try{
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
            AnchorPane newPane = loader.load();

            scene = new Scene(newPane);
            stage.setTitle("Cadastro Paciente");
            stage.setScene(scene);
            stage.show();
        }
        catch(db.DbException e){
            System.out.print(e);
        }
    }

    @FXML
    private void onBack(ActionEvent event) throws IOException {
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
        AnchorPane newPane = loader.load();
        
        scene = new Scene(newPane);
        stage.setTitle("Cadastro Paciente");
        stage.setScene(scene);
        stage.show();

    }
    
}
