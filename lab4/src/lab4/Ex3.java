/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author human
 */
public class Ex3 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        HBox textfieldBox = new HBox();
        textfieldBox.setPadding(new Insets(16));
        textfieldBox.setSpacing(16);
        textfieldBox.setAlignment(Pos.CENTER);
        
        Label nameLabel = new Label("Name:");
        nameLabel.setFont(Font.font("Verdana", FontWeight.MEDIUM, 16));
        TextField nameField = new TextField();
        
        textfieldBox.getChildren().addAll(nameLabel, nameField);
        
        
        MenuBar menuBar = new MenuBar();
        
        Menu drawMenu = new Menu("Draw");
        MenuItem exitItem = new MenuItem("Exit");
        drawMenu.getItems().addAll(exitItem);
        
        Menu designMenu = new Menu("Design");
        MenuItem changeColorItem = new MenuItem("Change Color");
        changeColorItem.setOnAction(value -> {
            nameField.setStyle("-fx-text-fill: red;");
        });
        designMenu.getItems().addAll(changeColorItem);
        
        Menu layoutMenu = new Menu("Layout");
        MenuItem lowercaseItem = new MenuItem("Lowercase");
        lowercaseItem.setOnAction(value -> {
            nameField.setText(nameField.getText().toLowerCase());
        });
        MenuItem uppercaseItem = new MenuItem("Uppercase");
        uppercaseItem.setOnAction(value -> {
            nameField.setText(nameField.getText().toUpperCase());
        });
        layoutMenu.getItems().addAll(lowercaseItem, uppercaseItem);
        
        menuBar.getMenus().addAll(drawMenu, designMenu, layoutMenu);
   
        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        root.setCenter(textfieldBox);
        
        Scene scene = new Scene(root, 600, 350);
        
        primaryStage.setTitle("Menu Toggle Case");
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