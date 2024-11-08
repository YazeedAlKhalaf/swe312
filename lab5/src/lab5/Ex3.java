/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package lab5;

import java.util.HashMap;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author human
 */
public class Ex3 extends Application {
    
    
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        
        Line line = new Line(250, 250, 350, 350);
        Circle circle = new Circle(350, 350, 50, Color.LIGHTGREEN);
        Rectangle rectangle = new Rectangle(250, 250, 250, 200);
        rectangle.setFill(Color.LIGHTSEAGREEN);
        Polygon polygon = new Polygon(
                250, 250,
                400, 350,
                450, 150
        );
        polygon.setFill(Color.LIGHTYELLOW);
        
        HashMap<String, Node> shapesMap = new HashMap<>();
        shapesMap.put("1", line);
        shapesMap.put("2",circle);
        shapesMap.put("3", rectangle);
        shapesMap.put("4", polygon);
        
        VBox helpBox = new VBox();
        helpBox.setPadding(new Insets(16));
        helpBox.setSpacing(16);
        
        Text helpText = new Text("Enter a number:\n1: Line\n2: Circle\n3: Rectangle\n4: Polygon");
        
        TextField tf = new TextField();
        
        Text errTxt = new Text("Please enter a number between 1-4");
        errTxt.setFill(Color.RED);
        
        Button drawShapeBtn = new Button("Draw Shape");
        drawShapeBtn.setOnAction(e -> {
            String shapeInput = tf.getText();
            if (!shapesMap.containsKey(shapeInput)) {
                root.setCenter(errTxt);
                return;
            }
            
            root.setCenter(shapesMap.get(shapeInput));
        });
        
        helpBox.getChildren().addAll(helpText, tf, drawShapeBtn);
        
        root.setTop(helpBox);
        
        Scene scene = new Scene(root, 400, 400);
        
        primaryStage.setTitle("Shape Drawer");
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
