/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package lab3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author yazeedalkhalaf
 */
public class Ex2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();
        root.setHgap(8);
        root.setVgap(8);
        root.setPadding(new Insets(16));
        
        Text title = new Text("McDonald's");
        title.setFont(Font.font("Times New Roman", FontWeight.BOLD, 48));
        title.setFill(Color.ORANGE);
        
        ImageView burgerImg = new ImageView(new Image("file:src/lab3/resources/hamburger.jpg"));
        burgerImg.setFitHeight(47.3);
        burgerImg.setFitWidth(64);
                
        root.add(title, 0, 0);
        root.add(burgerImg, 1, 0);
        
        
        Text pleaseFillNotice = new Text("Please fill the form below to place your order:");
        pleaseFillNotice.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 16));
        
        root.add(pleaseFillNotice, 0, 1, 3, 1);
        
        
        Label nameLabel = new Label("NAME:");
        nameLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        
        TextField fName = new TextField();
        TextField lName = new TextField();
        
        root.add(nameLabel, 0, 2);
        root.add(fName, 1, 2);
        root.add(lName, 2, 2);
        
        
        Label chickenMacLabel = new Label("Chicken Mac");
        chickenMacLabel.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 16));
        TextField chickenMac = new TextField();
        Text chickenMacPrice = new Text("$5");
        chickenMacPrice.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 16));
        
        root.add(chickenMacLabel, 0, 3);
        root.add(chickenMac, 1, 3);
        root.add(chickenMacPrice, 2, 3);
        
        
        Label bigMacLabel = new Label("Big Mac");
        bigMacLabel.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 16));
        TextField bigMac = new TextField();
        Text bignMacPrice = new Text("$5");
        bignMacPrice.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 16));
        
        root.add(bigMacLabel, 0, 4);
        root.add(bigMac, 1, 4);
        root.add(bignMacPrice, 2, 4);
        
        
        Label cheeseBurgerLabel = new Label("Cheese Burger");
        cheeseBurgerLabel.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 16));
        TextField cheeseBurger = new TextField();
        Text cheeseBurgerPrice = new Text("$5");
        cheeseBurgerPrice.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 16));
        
        root.add(cheeseBurgerLabel, 0, 5);
        root.add(cheeseBurger, 1, 5);
        root.add(cheeseBurgerPrice, 2, 5);
        
        
        Label specialRequestsLabel = new Label("Special requests:");
        specialRequestsLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        
        root.add(specialRequestsLabel, 0, 6, 3, 1);
        
        
        TextArea specialRequests = new TextArea();
        
        root.add(specialRequests, 0, 7, 3, 1);
        
        
        Text confirmMsg = new Text();
        confirmMsg.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 16));
        confirmMsg.setFill(Color.RED);
        
        root.add(confirmMsg, 0, 8, 3, 1);
        
        
        Button orderBtn = new Button();
        orderBtn.setText("ORDER");
        orderBtn.setFont(Font.font("Verdana", FontWeight.BOLD, 16));
        orderBtn.setOnAction(e -> {
            Integer subtotal, chickenMacParsed, bigMacParsed, cheeseBurgerParsed;
            
            if (chickenMac.getText().isEmpty() ) {
                chickenMacParsed = 0;
            } else {
                chickenMacParsed = Integer.valueOf(chickenMac.getText());
            }
            
            if (bigMac.getText().isEmpty() ) {
                bigMacParsed = 0;
            } else {
                bigMacParsed = Integer.valueOf(bigMac.getText());
            }
            
            if (cheeseBurger.getText().isEmpty() ) {
                cheeseBurgerParsed = 0;
            } else {
                cheeseBurgerParsed = Integer.valueOf(cheeseBurger.getText());
            }
            
            subtotal = (chickenMacParsed * 5) + (bigMacParsed * 7) + (cheeseBurgerParsed * 4);
            
            String confirmMsgFilled = "Thank you " + fName.getText().toUpperCase() + " " + lName.getText().toUpperCase() + " for shopping with us\n" + specialRequests.getText() + "\nSubtotal $" + subtotal.toString() + "\nHave a nice day";
            confirmMsg.setText(confirmMsgFilled);
        });
        
        root.add(orderBtn, 1, 9, 3, 1);
        
        
        Scene scene = new Scene(root, 600, 500);
        
        primaryStage.setTitle("McDonald's");
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
