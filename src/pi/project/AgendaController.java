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
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Pc
 */
public class AgendaController implements Initializable {

    @FXML
    private Text ExamName4;
    @FXML
    private Rectangle ExamBody4;
    @FXML
    private Text ExamDate4;
    @FXML
    private Rectangle ExamBody2;
    @FXML
    private Text ExamDate2;
    @FXML
    private Text ExamName2;
    @FXML
    private Text ExamDate3;
    @FXML
    private Rectangle ExamBody3;
    @FXML
    private Text ExamName3;
    @FXML
    private Rectangle ExamBody1;
    @FXML
    private Text ExamDate1;
    @FXML
    private Text ExamName1;
    @FXML
    private Text BadStats;
    
    
    @FXML
    private TextField ExamName;
    @FXML
    private DatePicker ExamDate;
    
    private int slot = 1;
    private String slotname = "Exam";
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Add_Consulta(ActionEvent event) {
        
        if(!(ExamName.getText().length() == 0) || !(ExamDate.getValue().toString().length() == 0)){
            BadStats.setOpacity(0);
            switch(slot){
                case 1:
                    ExamBody1.setOpacity(1);
                    ExamName1.setText(ExamName.getText());
                    ExamDate1.setText(ExamDate.getValue().toString());
                    break;
                case 2:
                    ExamBody2.setOpacity(1);
                    ExamName2.setText(ExamName.getText());
                    ExamDate2.setText(ExamDate.getValue().toString());
                    break;
                case 3:
                    ExamBody3.setOpacity(1);
                    ExamName3.setText(ExamName.getText());
                    ExamDate3.setText(ExamDate.getValue().toString());
                    break;
                case 4:
                    ExamBody4.setOpacity(1);
                    ExamName4.setText(ExamName.getText());
                    ExamDate4.setText(ExamDate.getValue().toString());
                    break;    
            }
            slot++;
        }
        else{
            BadStats.setOpacity(1);
        }
        
    }
}
