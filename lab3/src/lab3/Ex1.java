/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package lab3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author yazeedalkhalaf
 */
public class Ex1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // title
        Text title = new Text("My Currency Converter");
        title.setFont(Font.font("Times New Roman", FontWeight.BOLD, 32));
        
        // START - usToSarBox
        HBox usToSarBox = new HBox();
        usToSarBox.setAlignment(Pos.BOTTOM_CENTER);
        usToSarBox.setSpacing(8);
        
        VBox usDollar1Box = new VBox();
        Label usDollar1Label = new Label("US DOLLAR");
        usDollar1Label.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 16));
        TextField usDollar1TextField = new TextField();
        usDollar1Box.getChildren().addAll(usDollar1Label, usDollar1TextField);
        
        VBox sar1Box = new VBox();
        Label sar1Label = new Label("SAR RIYAL");
        sar1Label.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 16));
        TextField sar1TextField = new TextField();
        sar1Box.getChildren().addAll(sar1Label, sar1TextField);
        
        Button usToSarBtn = new Button();
        usToSarBtn.setText("Convert");
        usToSarBtn.setOnAction(e -> {
            Double usAmount = Double.valueOf(usDollar1TextField.getText());
            Double sarAmount = usAmount * 3.75;
            
            sar1TextField.setText(sarAmount.toString());
        });
        
        usToSarBox.getChildren().addAll(usDollar1Box, usToSarBtn, sar1Box);
        // END - usToSarBox
        
        // START - sarToUsBox
        HBox sarToUsBox = new HBox();
        sarToUsBox.setAlignment(Pos.BOTTOM_CENTER);
        sarToUsBox.setSpacing(8);
        
        VBox sar2Box = new VBox();
        Label sar2Label = new Label("SAR RIYAL");
        sar2Label.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 16));
        TextField sar2TextField = new TextField();
        sar2Box.getChildren().addAll(sar2Label, sar2TextField);
        
        VBox usDollar2Box = new VBox();
        Label usDollar2Label = new Label("US DOLLAR");
        usDollar2Label.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 16));
        TextField usDollar2TextField = new TextField();
        usDollar2Box.getChildren().addAll(usDollar2Label, usDollar2TextField);
        
        Button sarToUsBtn = new Button();
        sarToUsBtn.setText("Convert");
        sarToUsBtn.setOnAction(e -> {
            Double sarAmount = Double.valueOf(sar2TextField.getText());
            Double usAmount = sarAmount / 3.75;
            
            usDollar2TextField.setText(usAmount.toString());
        });
        
        sarToUsBox.getChildren().addAll(sar2Box, sarToUsBtn, usDollar2Box);
        // END - sarToUsBox
        
        VBox root = new VBox();
        root.setSpacing(16);
        root.setPadding(new Insets(16));
        root.getChildren().addAll(title, usToSarBox, sarToUsBox);
        
        Scene scene = new Scene(root, 600, 500);
        
        primaryStage.setTitle("My Currency Converter");
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
