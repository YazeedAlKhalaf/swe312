/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package bonus;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author human
 */
public class Bonus extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        TextField tf = new TextField();
        tf.setPromptText("Enter you age");
        tf.setStyle("-fx-background-color: yellow");
        
        Text ageStatusTxt = new Text();
        ageStatusTxt.setFill(Color.BLUE);
        
        Button btn = new Button();
        btn.setText("Classify");
        btn.setStyle("-fx-background-color: #008001; -fx-text-fill: white;");
        btn.setOnAction(e -> {
            String ageRaw = tf.getText();
            Integer ageParsed = Integer.parseInt(ageRaw);
            if (ageParsed > 60) {
                ageStatusTxt.setText("You are old.");
            } else {
                ageStatusTxt.setText("You are young.");
            }
        });
        
        VBox root = new VBox();
        root.setPadding(new Insets(16));
        root.setSpacing(16);
        root.getChildren().addAll(tf, btn, ageStatusTxt);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Age Classifier");
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
