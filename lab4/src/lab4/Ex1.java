/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package lab4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author human
 */
public class Ex1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        MenuBar menuBar = new MenuBar();
        
        Menu fileMenu = new Menu("File");
        MenuItem newItem = new MenuItem("New");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");
        fileMenu.getItems().addAll(newItem, saveItem, exitItem);
        
        
        Menu webMenu = new Menu("Web");
        MenuItem awsItem = new MenuItem("AWS");
        MenuItem azureItem = new MenuItem("Azure");
        webMenu.getItems().addAll(awsItem, azureItem);
        
        Menu sqlMenu = new Menu("SQL");
        MenuItem mysqlItem = new MenuItem("MySQL");
        MenuItem oracleItem = new MenuItem("Oracle");
        
        Menu tutorialMenu = new Menu("Tutorial");
        MenuItem javaItem = new MenuItem("Java");
        MenuItem javaFxItem = new MenuItem("Java FX");
        MenuItem swingItem = new MenuItem("Swing");
        tutorialMenu.getItems().addAll(javaItem, javaFxItem, swingItem);
        
        sqlMenu.getItems().addAll(mysqlItem, oracleItem, tutorialMenu);
        
        menuBar.getMenus().addAll(fileMenu, webMenu, sqlMenu);
                
        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Create JavaFX Menu");
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
