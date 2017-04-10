
import assign2.Person;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shanty
 */
public class LaunchAssign2View extends Application{
public static void main(String[] args){
    
           launch(args);
       }
/**
 * fxml loader load the label and button and set the location of it
 * @param primaryStage
 * @throws Exception 
 */

    @Override
    public void start(Stage primaryStage) throws Exception {
      FXMLLoader creater= new FXMLLoader();
      creater.setLocation(getClass().getResource("assign2View.fxml"));
      /**
       * this help in creating the layout
       */
      AnchorPane createlayout=creater.load();
     
      /**
       * 
       */
      Scene createscene = new Scene(createlayout);
      primaryStage.setScene(createscene);
      primaryStage.setTitle("Athlete Adder");/**
       * set title on the top of window
      
      */
      primaryStage.show();
    }
    
}
