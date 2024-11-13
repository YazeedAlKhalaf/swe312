/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package lab6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author human
 */
public class Ex2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle();
        circle.setRadius(25);
        circle.setFill(Color.RED);
        
        Rectangle rect = new Rectangle(50, 25, Color.ANTIQUEWHITE);
        
        Polygon tri = new Polygon(
                0, 0,
                40, 80,
                80, 0
        );
        tri.setFill(Color.GREENYELLOW);
            
        Button hideBtn = new Button("Hide");
        hideBtn.setOnAction(e -> {
            circle.setOpacity(0);
            rect.setOpacity(0);
            tri.setOpacity(0);
        });
        
        Button showBtn = new Button("Show");
        showBtn.setOnAction(e -> {
            circle.setOpacity(1);
            rect.setOpacity(1);
            tri.setOpacity(1);
        });
        
        Button changeColorBtn = new Button("Change Color");
        changeColorBtn.setOnAction(e -> {
            circle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            rect.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            tri.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        });
        
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(16);
        root.setHgap(16);
        
        root.add(circle, 0, 0);
        root.add(rect, 1, 0);
        root.add(tri, 2, 0);
        
        root.add(hideBtn, 0, 1);
        root.add(showBtn, 1, 1);
        root.add(changeColorBtn, 2, 1);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Shape Controller");
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
