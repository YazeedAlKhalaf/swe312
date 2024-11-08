/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package lab5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author human
 */
public class Ex1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Circle c1 = new Circle();
        c1.setCenterX(100.0f);
        c1.setCenterY(75.0f);
        c1.setRadius(25.0f);
        c1.setFill(Color.BLUE);
        
        Circle c2 = new Circle();
        c2.setCenterX(175.0f);
        c2.setCenterY(150.0f);
        c2.setRadius(25.0f);
        c2.setFill(Color.BLUE);
        
        double distance = Math.sqrt(Math.pow(c2.getCenterX() - c1.getCenterX(), 2) + Math.pow(c2.getCenterY() - c1.getCenterY(), 2));
        
        Line line = new Line();
        line.setStartX(c1.getCenterX());
        line.setStartY(c1.getCenterY());
        line.setEndX(c2.getCenterX());
        line.setEndY(c2.getCenterY());
        
        Text lineTxt = new Text((c1.getCenterX() + c2.getCenterX()) / 2, (c1.getCenterY() + c2.getCenterY()) / 2, String.format("Distance: %.2f", distance));
        
        Pane root = new Pane();
        root.getChildren().addAll(c1, c2, line, lineTxt);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Line connecting two Circles");
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
