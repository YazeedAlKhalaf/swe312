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
public class Ex3 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label nameFieldTitle = new Label("Passenger Name:");
        TextField nameField = new TextField();
        
        Label destinationFieldTitle = new Label("Destination:");
        TextField destinationField = new TextField();
        
        Label classFieldTitle = new Label("Class:");
        TextField classField = new TextField();
        
        Label creditCardNumberFieldTitle = new Label("Credit Card Number:");
        TextField creditCardNumberField = new TextField();
        
        Button submitBtn = new Button("Submit");
        submitBtn.setOnAction(e -> {
            System.out.println("passenger name: " + nameField.getText());
            System.out.println("destination: " + destinationField.getText());
            System.out.println("class: " + classField.getText());
            System.out.println("credit card number: " + creditCardNumberField.getText());
        });
        Button clearBtn = new Button("Clear");
        clearBtn.setOnAction(e -> {
            nameField.setText("");
            destinationField.setText("");
            classField.setText("");
            creditCardNumberField.setText("");
        });
        
        VBox root1 = new VBox();
        root1.getChildren().add(nameFieldTitle);
        root1.getChildren().add(nameField);
        
        root1.getChildren().add(destinationFieldTitle);
        root1.getChildren().add(destinationField);
        
        root1.getChildren().add(classFieldTitle);
        root1.getChildren().add(classField);
        
        root1.getChildren().add(creditCardNumberFieldTitle);
        root1.getChildren().add(creditCardNumberField);
        
        root1.getChildren().add(submitBtn);
        root1.getChildren().add(clearBtn);
        
        Scene scene1 = new Scene(root1, 300, 250);
        
        primaryStage.setTitle("Booking Airline Ticket");
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
