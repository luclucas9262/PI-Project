
package javafxapplication1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Pc
 */
public class LoginController implements Initializable {

    String usuario = "a";
    String senha = "a";
    
    
    
    @FXML
    private TextField tfUser;
    @FXML
    private TextField tfPassword;
    
    @FXML
    private Text BadStats;
    
    private Stage stage;
    private static Scene scene;
    private Parent root;

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
    private void onClickEnter(ActionEvent event) throws IOException {
            if (usuario.equals(tfUser.getText()) && senha.equals(tfPassword.getText())){
                try {
                stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/Main.fxml"));
                ScrollPane scrollPane = loader.load();

                scrollPane.setFitToHeight(true);
                scrollPane.setFitToWidth(true);
                
                scene = new Scene(scrollPane);
                stage.setTitle("Cadastro Paciente");
                stage.setScene(scene);
                stage.show();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
            else {
                BadStats.setOpacity(1);
            }
    }
    
    public static Scene getMainScene(){
        return scene;
    }
    
}
