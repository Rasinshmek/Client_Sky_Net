/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client_skynet;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author alpha
 */
public class NewFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
      Ground g=new Ground();
        g.setVisible(true);
        g.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
