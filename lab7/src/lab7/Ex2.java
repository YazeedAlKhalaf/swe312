/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package lab7;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author human
 */
public class Ex2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Arc path = new Arc(50, 50, 50, 50, 30, 180);
        path.setFill(Color.YELLOW);
        path.setStroke(Color.BLACK);
        
        Circle node = new Circle(10);
        node.setFill(Color.WHITE);
        node.setStroke(Color.BLACK);
        
        PathTransition pt = new PathTransition();
        pt.setPath(path);
        pt.setNode(node);
        pt.setDuration(Duration.millis(1500));
        pt.setCycleCount(PathTransition.INDEFINITE);
        pt.setAutoReverse(true);
        pt.play();
        
        StackPane root = new StackPane();
        root.setPadding(new Insets(32));
        
        Pane animPane = new Pane();
        animPane.getChildren().addAll(path, node);
        
        root.getChildren().addAll(animPane);
        
        Scene scene = new Scene(root, 300, 250);
        
        scene.setOnKeyPressed(e->{
            if (e.getCode() == KeyCode.ESCAPE) {
                pt.pause();
            } else if (e.getCode() == KeyCode.ENTER) {
                pt.play();
            }
        });
        
        primaryStage.setTitle("Arc Animation");
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
