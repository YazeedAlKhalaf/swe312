/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package lab5;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author human
 */
public class Ex2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle(150, 150, 50, Color.BLUE);
        
        MenuBar menuBar = new MenuBar();
        
        Menu fileMenu = new Menu("File");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");
        exitItem.setOnAction(e -> {
            Platform.exit();
        });
        fileMenu.getItems().addAll(openItem, saveItem, exitItem);
        
        Menu shapeMenu = new Menu("Shape");
        MenuItem colorItem = new MenuItem("Color");
        Menu changeColorMenu = new Menu("Change Color");
        MenuItem redItem = new MenuItem("Red");
        redItem.setOnAction(e -> {
            circle.setFill(Color.RED);
        });
        MenuItem greenItem = new MenuItem("Green");
        greenItem.setOnAction(e -> {
            circle.setFill(Color.GREEN);
        });
        MenuItem blueItem = new MenuItem("Blue");
        blueItem.setOnAction(e -> {
            circle.setFill(Color.BLUE);
        });
        changeColorMenu.getItems().addAll(redItem, greenItem, blueItem);
        shapeMenu.getItems().addAll(colorItem, changeColorMenu);
        
        menuBar.getMenus().addAll(fileMenu, shapeMenu);
   
        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        root.setCenter(circle);
        
        Scene scene = new Scene(root, 300, 300);
        
        primaryStage.setTitle("");
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
