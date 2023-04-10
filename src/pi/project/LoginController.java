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

    String usuario = "Admin";
    String senha = "Admin";
    
    
    
    @FXML
    private TextField tfUser;
    @FXML
    private TextField tfPassword;
    
    @FXML
    private Text GoodStats;
    @FXML
    private Text BadStats;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clickRegister(MouseEvent event) {
        // TODO
    }

    @FXML
    private void onClickEnter(ActionEvent event) {
            if (usuario.equals(tfUser.getText()) && senha.equals(tfPassword.getText())){
                GoodStats.setOpacity(1);
                BadStats.setOpacity(0);
            }
            else {
                GoodStats.setOpacity(0);
                BadStats.setOpacity(1);
            }
    }
    
}
