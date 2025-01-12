/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gui;

import gui.util.Constraints;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Pc
 */
public class FuncionarioController implements Initializable {

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
    private ToggleGroup groupSex;
    @FXML
    private RadioButton femid;
    @FXML
    private RadioButton radioAtendee;
    @FXML
    private ToggleGroup groupCargo;
    @FXML
    private RadioButton radioMedic;
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

    /**
     * Initializes the controller class.
     */
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
    private void onRadioSex(ActionEvent event) {
    }

    @FXML
    private void onsolteiroAction(ActionEvent event) {
    }

    @FXML
    private void oncasadoAction(ActionEvent event) {
    }

    @FXML
    private void onBotaoAction(ActionEvent event) {
    }
    
}
