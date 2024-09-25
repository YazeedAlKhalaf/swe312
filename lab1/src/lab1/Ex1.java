/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author 202211123
 */
public class Ex1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button();
        btn1.setText("Al Yamamah University");
        btn1.setOnAction(e -> {
            System.out.println("Al Yamamah University clicked!");
        });
        
        StackPane root1 = new StackPane();
        root1.getChildren().add(btn1);
        
        Scene scene1 = new Scene(root1, 300, 250);
        
        primaryStage.setTitle("Stage 1");
        primaryStage.setScene(scene1);
        primaryStage.show();
        
        // ======
        
        Button btn2 = new Button();
        btn2.setText("Software Engineering");
        btn2.setOnAction(e -> {
            System.out.println("Software Engineering clicked!");
        });
        
        StackPane root2 = new StackPane();
        root2.getChildren().add(btn2);
        
        Scene scene2 = new Scene(root2, 300, 250);
        
        Stage stage2 = new Stage();
        stage2.setTitle("Stage 2");
        stage2.setScene(scene2);
        stage2.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
