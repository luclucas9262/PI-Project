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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Pc
 */
public class AgendaController implements Initializable {

    @FXML
    private TextField ExamName;
    @FXML
    private DatePicker ExamDate;
    @FXML
    private Text BadStats, Month;
    @FXML
    private Text Desc10, Desc20, Desc30, Desc40, Desc50, Desc60, Desc70, Desc71, Desc61, Desc51, Desc41, Desc31, Desc21, Desc11, Desc72, Desc62, Desc52, Desc42, Desc32, Desc22, Desc12,  Desc73, Desc63, Desc53, Desc43, Desc33, Desc23, Desc13,  Desc74, Desc64, Desc54, Desc44, Desc34, Desc24, Desc14,  Desc75, Desc65, Desc55, Desc45, Desc35, Desc25, Desc15;
    @FXML
    private Text Number10, Number20, Number30, Number40, Number50, Number60, Number70, Number71, Number61, Number51, Number41, Number31, Number21, Number11, Number72, Number62, Number52, Number42, Number32, Number22, Number12, Number73, Number63, Number53, Number43, Number33, Number23, Number13, Number74, Number64, Number54, Number44, Number34, Number24, Number14, Number75, Number65, Number55, Number45, Number35, Number25, Number15;
    
    private Text[] dayDesc = {Desc10, Desc20, Desc30, Desc40, Desc50, Desc60, Desc70, Desc11, Desc21, Desc31, Desc41, Desc51, Desc61, Desc71, Desc12, Desc22, Desc32, Desc42, Desc52, Desc62, Desc72, Desc13, Desc23, Desc33, Desc43, Desc53, Desc63, Desc73, Desc14, Desc24, Desc34, Desc44, Desc54, Desc64, Desc74, Desc15, Desc25, Desc35, Desc45, Desc55, Desc65, Desc75};
    private Text[] dayNumber = {Number10, Number20, Number30, Number40, Number50, Number60, Number70, Number11, Number21, Number31, Number41, Number51, Number61, Number71, Number12, Number22, Number32, Number42, Number52, Number62, Number72, Number13, Number23, Number33, Number43, Number53, Number63, Number73, Number14, Number24, Number34, Number44, Number54, Number64, Number74, Number15, Number25, Number35, Number45, Number55, Number65, Number75};
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Add_Consulta(ActionEvent event) {
    }

    @FXML
    private void MinusMonth(MouseEvent event) {
    }

    @FXML
    private void AddMonth(MouseEvent event) {
    }
    
}
