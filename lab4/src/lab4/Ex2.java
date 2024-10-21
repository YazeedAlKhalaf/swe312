/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package lab4;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author human
 */
public class Ex2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        MenuBar menuBar = new MenuBar();
        
        Menu fileMenu = new Menu("File");
        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open...");
        MenuItem saveItem = new MenuItem("Save");
        SeparatorMenuItem saveExitSep = new SeparatorMenuItem();
        MenuItem exitItem = new MenuItem("Exit");
        fileMenu.getItems().addAll(newItem, openItem, saveItem, saveExitSep, exitItem);
        
        
        Menu editMenu = new Menu("Edit");
        MenuItem cutItem = new MenuItem("Cut");
        MenuItem copyItem = new MenuItem("Copy");
        MenuItem pasteItem = new MenuItem("Paste");
        editMenu.getItems().addAll(cutItem, copyItem, pasteItem);
        
        Menu viewMenu = new Menu("View");
        
        Menu languageMenu = new Menu("Language");
        
        Menu searchMenu = new Menu("Search");
        MenuItem findItem = new MenuItem("Find");
        MenuItem findNextItem = new MenuItem("Find Next");
        Menu changeHistoryMenu = new Menu("Change History");
        MenuItem nextChangeItem = new MenuItem("Go to Next Change");
        MenuItem prevChangeItem = new MenuItem("Go to Previous Change");
        changeHistoryMenu.getItems().addAll(nextChangeItem, prevChangeItem);
        searchMenu.getItems().addAll(findItem, findNextItem, changeHistoryMenu);
        
        Menu windowMenu = new Menu("Window");
        
        Menu helpMenu = new Menu("Help");
        
        
        menuBar.getMenus().addAll(fileMenu, editMenu, viewMenu, languageMenu, searchMenu, windowMenu, helpMenu);
                
        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        
        Scene scene = new Scene(root, 600, 350);
        
        primaryStage.setTitle("Notepad++ Style Menu");
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
