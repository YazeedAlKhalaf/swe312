/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author 202211123
 */
public class Ex2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label nameFieldTitle = new Label("Name");
        TextField nameField = new TextField();
        
        Label usernameFieldTitle = new Label("Username");
        TextField usernameField = new TextField();
        
        Label passwordFieldTitle = new Label("Password");
        TextField passwordField = new TextField();
        
        Button registerBtn = new Button("REGISTER");
        registerBtn.setOnAction(e -> {
            System.out.println("name: " + nameField.getText());
            System.out.println("username: " + usernameField.getText());
            System.out.println("password: " + passwordField.getText());
        });
        Button clearBtn = new Button("CLEAR");
        clearBtn.setOnAction(e -> {
            nameField.setText("");
            usernameField.setText("");
            passwordField.setText("");
        });
        
        VBox root1 = new VBox();
        root1.getChildren().add(nameFieldTitle);
        root1.getChildren().add(nameField);
        
        root1.getChildren().add(usernameFieldTitle);
        root1.getChildren().add(usernameField);
        
        root1.getChildren().add(passwordFieldTitle);
        root1.getChildren().add(passwordField);
        
        root1.getChildren().add(registerBtn);
        root1.getChildren().add(clearBtn);
        
        Scene scene1 = new Scene(root1, 300, 250);
        
        primaryStage.setTitle("Simple Form");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
