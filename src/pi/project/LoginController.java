/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package pi.project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Pc
 */
public class LoginController implements Initializable {

    String usuario = "yoriichi";
    String senha = "eu sinto pena";
    
    
    
    @FXML
    private TextField tfUser;
    @FXML
    private TextField tfPassword;
    
    @FXML
    private Text yoriichi;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Alahoi");
        // TODO
    }    

    @FXML
    private void clickRegister(MouseEvent event) {
        System.out.println("Alahoi");

    }

    @FXML
    private void onClickEnter(ActionEvent event) {
        System.out.println("Alahoi");
        yoriichi.setText(tfUser.getText());
                if (usuario.equals(tfUser.getText()) && senha.equals(tfPassword.getText())){
                    yoriichi.setText("Login realizado com sucesso");
                }
                else {
                    yoriichi.setText("Login não realizado");
                }
    }
    
}
