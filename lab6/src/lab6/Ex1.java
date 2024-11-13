package lab6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author human
 */
public class Ex1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle();
        circle.setRadius(20);
        circle.setFill(Color.BLUE);
        
        HBox btns = new HBox();
        btns.setAlignment(Pos.CENTER);
        btns.setSpacing(16);
        btns.setPadding(new Insets(16));
        
        Button enlargeBtn = new Button("Enlarge");
        Button shrinkBtn = new Button("Shrink");
        
        enlargeBtn.setTextFill(Color.RED);
        shrinkBtn.setTextFill(Color.GREEN);
        
        enlargeBtn.setOnAction(e -> {
            circle.setRadius(circle.getRadius() + 10);
            shrinkBtn.setDisable(false);
            
            if (circle.getRadius() == 150) {
                enlargeBtn.setDisable(true);
                return;
            }
        });
        shrinkBtn.setOnAction(e -> {
            circle.setRadius(circle.getRadius() - 10);
            enlargeBtn.setDisable(false);
            
            if (circle.getRadius() == 10) {
                shrinkBtn.setDisable(true);
                return;
            }
        });
        
        Button resetBtn = new Button("Reset");
        resetBtn.setOnAction(e -> {
            circle.setRadius(20);
        });
        
        btns.getChildren().addAll(enlargeBtn, shrinkBtn, resetBtn);
        
        BorderPane root = new BorderPane();
        root.setCenter(circle);
        root.setBottom(btns);
        
        Scene scene = new Scene(root, 400, 400);
        
        primaryStage.setTitle("Show Circle!");
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
