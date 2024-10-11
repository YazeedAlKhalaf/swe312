/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package lab3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author yazeedalkhalaf
 */
public class Ex3 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();
        root.setHgap(8);
        root.setVgap(8);
        root.setPadding(new Insets(16));
        
        ImageView bmiImg = new ImageView(new Image("file:src/lab3/resources/bmi.png"));
        bmiImg.setFitHeight(64);
        bmiImg.setFitWidth(64);
        
        root.add(bmiImg, 1, 0);
        
        Label heightLabel = new Label("Height (cm):");
        TextField heightTxtFld = new TextField();
        
        root.add(heightLabel, 0, 1);
        root.add(heightTxtFld, 1, 1);
        
        
        Label weightLabel = new Label("Weight (pounds):");
        TextField weightTxtFld = new TextField();
        
        root.add(weightLabel, 0, 2);
        root.add(weightTxtFld, 1, 2);
        
        
        Text bmiTxt = new Text("BMI:");
        
        Button calculateBtn = new Button();
        calculateBtn.setText("Calculate");
        calculateBtn.setOnAction(e -> {
            Double height, weight, bmi;
            String rawHeight, rawWeight;
            
            rawHeight = heightTxtFld.getText();
            rawWeight = weightTxtFld.getText();
            if (rawHeight.isEmpty() || rawWeight.isEmpty()) {
                bmiTxt.setText("BMI: " + "NULL");
                return;
            }
            
            height = Double.valueOf(rawHeight);
            weight = Double.valueOf(rawWeight);
            
            height = height / 100;
            weight = weight * 0.45359237;
            
            bmi = weight / (height * height);
            bmiTxt.setText("BMI: " + String.format("%.2f", bmi));
        });
        
        root.add(bmiTxt, 0, 3);
        root.add(calculateBtn, 1, 3);

        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("BMI Calculator");
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
