/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import assign2.Person;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Formatter;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.ConditionalFeature.FXML;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Shanty
 */
/**
 * 
 * @author Shanty
 */
public class Assign2ViewController implements Initializable {
    @FXML private TextField nametextfield;
    @FXML private TextField fathernametextfield;
    @FXML private DatePicker dobtextfield;
    @FXML private TextField heighttextfield;
    @FXML private TextField weighttextfield;
    @FXML private TextField heartratetextfield;
    @FXML private TextField interesttextfield;
    @FXML private TextField best100mtextfield;
    @FXML private TextField best200mtextfield;
    @FXML private TextField best5kmtextfield;
    @FXML private Button  submitbutton;
    
    private Person raman;
  /**
   * grab the text from the form and change them according to the required needs
   */  
    public void addAthletebuttonPushed(){
        raman = new Person(nametextfield.getText(), fathernametextfield.getText(), interesttextfield.getText(), Double.parseDouble(heighttextfield.getText()), Double.parseDouble(weighttextfield.getText()), Double.parseDouble(heartratetextfield.getText()), Double.parseDouble(best100mtextfield.getText()),Double.parseDouble(best200mtextfield.getText()),Double.parseDouble(best5kmtextfield.getText()), dobtextfield.getValue());

              System.out.printf("the New Athlete is :%s",raman.toString());
            }
/**
 * this method print the input to the file
 */
    public void printToFile() {
        try {
            Formatter formatter = new Formatter(new File("assign.txt"));
            if (raman != null) {
            formatter.format(String.format("%s", raman.getName()));
            formatter .close();}
        } catch (FileNotFoundException ex) {
            
        }
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
  
    }
}
  
    

