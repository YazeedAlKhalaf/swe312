/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package lab2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author yazeedalkhalaf
 */
public class Ex1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        root.setPadding(new Insets(16));
        root.setSpacing(16);
        
        // name
        Label nameFieldTitle = new Label("Name");
        TextField nameField = new TextField();
        nameField.setMaxWidth(200);
        
        VBox nameContainer = new VBox();
        nameContainer.getChildren().addAll(nameFieldTitle, nameField);
        
        // username
        Label usernameFieldTitle = new Label("Username");
        TextField usernameField = new TextField();
        
        VBox usernameContainer = new VBox();
        usernameContainer.getChildren().addAll(usernameFieldTitle, usernameField);
        
        // password
        Label passwordFieldTitle = new Label("Password");
        TextField passwordField = new TextField();
        
        VBox passwordContainer = new VBox();
        passwordContainer.getChildren().addAll(passwordFieldTitle, passwordField);
        
        // status text
        Label statusText = new Label("");
        
        // register btn
        Button registerBtn = new Button();
        registerBtn.setText("REGISTER");
        registerBtn.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            if (username.equals("YU") && password.equals("1234")) {
                statusText.setText("Access Granted");
                statusText.setFont(Font.font("Courier", FontWeight.BOLD, 16));
                statusText.setTextFill(Color.GREEN);
            } else {
                statusText.setText("Access Denied");
                statusText.setFont(Font.font("Courier", FontWeight.BOLD, 16));
                statusText.setTextFill(Color.RED);
            }
        });
        
        // clear btn
        Button clearBtn = new Button();
        clearBtn.setText("CLEAR");
        clearBtn.setOnAction(e -> {
            nameField.setText("");
            usernameField.setText("");
            passwordField.setText("");
            statusText.setText("");
        });
        
        HBox buttonsArea = new HBox();
        buttonsArea.setSpacing(16);
        buttonsArea.getChildren().addAll(registerBtn, clearBtn);
        
        root.getChildren().addAll(
                nameContainer,
                usernameContainer,
                passwordContainer,
                buttonsArea,
                statusText
        );
        
        Scene scene = new Scene(root, 300, 280);
        
        primaryStage.setTitle("Simple Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
