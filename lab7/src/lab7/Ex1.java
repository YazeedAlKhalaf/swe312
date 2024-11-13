/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package lab7;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author human
 */
public class Ex1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Rectangle path = new Rectangle(100, 100);
        path.setFill(null);
        path.setStroke(Color.BLACK);
        Rectangle node = new Rectangle(15, 15);
        node.setFill(Color.GREEN);
        
        PathTransition pt = new PathTransition();
        pt.setPath(path);
        pt.setNode(node);
        pt.setDuration(Duration.millis(1500));
        pt.setCycleCount(PathTransition.INDEFINITE);
        pt.play();
        
        StackPane root = new StackPane();
        root.setPadding(new Insets(32));
        
        Pane animPane = new Pane();
        animPane.getChildren().addAll(path, node);
        
        root.getChildren().addAll(animPane);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("PathTransition Demo");
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
