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
public class Ex4 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label nameFieldTitle = new Label("Student Name:");
        TextField nameField = new TextField();
        
        Label gradeFieldTitle = new Label("Grade:");
        TextField gradeField = new TextField();
        
        Label parentContactFieldTitle = new Label("Parent Contact:");
        TextField parentContactField = new TextField();
        
        Label extracurricularActivitiesFieldTitle = new Label("Extracurricular Activities:");
        TextField extracurricularActivitiesField = new TextField();
        
        Button submitBtn = new Button("Submit");
        submitBtn.setOnAction(e -> {
            System.out.println("student name: " + nameField.getText());
            System.out.println("grade: " + gradeField.getText());
            System.out.println("parent contact: " + parentContactField.getText());
            System.out.println("extracurricular activities: " + extracurricularActivitiesField.getText());
        });
        Button clearBtn = new Button("Clear");
        clearBtn.setOnAction(e -> {
            nameField.setText("");
            gradeField.setText("");
            parentContactField.setText("");
            extracurricularActivitiesField.setText("");
        });
        
        VBox root1 = new VBox();
        root1.getChildren().add(nameFieldTitle);
        root1.getChildren().add(nameField);
        
        root1.getChildren().add(gradeFieldTitle);
        root1.getChildren().add(gradeField);
        
        root1.getChildren().add(parentContactFieldTitle);
        root1.getChildren().add(parentContactField);
        
        root1.getChildren().add(extracurricularActivitiesFieldTitle);
        root1.getChildren().add(extracurricularActivitiesField);
        
        root1.getChildren().add(submitBtn);
        root1.getChildren().add(clearBtn);
        
        Scene scene1 = new Scene(root1, 300, 250);
        
        primaryStage.setTitle("Student Enrollment Form");
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
