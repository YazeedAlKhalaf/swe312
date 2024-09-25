/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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
        VBox root = new VBox();
        root.setPadding(new Insets(16));
        root.setSpacing(16);
        
        VBox formBody = new VBox();
        formBody.setSpacing(16);
        
        // title section
        Text titleTxt = new Text("FLIGHT RESERVATION");
        titleTxt.setFill(Color.RED);
        titleTxt.setFont(Font.font("Verdana", FontWeight.BOLD, 24));
        
        HBox titleSection = new HBox();
        titleSection.setAlignment(Pos.CENTER);
        titleSection.getChildren().addAll(titleTxt);
        
        // passenger information
        Label passengerInfoFieldTitle = new Label("Passenger Information");
        passengerInfoFieldTitle.setPadding(new Insets(0, 0, 4, 0));
        TextField passengerInfoField = new TextField();
        
        VBox passengerInfoContainer = new VBox();
        passengerInfoContainer.getChildren().addAll(passengerInfoFieldTitle, passengerInfoField);
        
        // date of birth
        Label dobFieldTitle = new Label("Date of Birth");
        dobFieldTitle.setPadding(new Insets(0, 0, 4, 0));
        DatePicker dobField = new DatePicker();
        
        VBox dobContainer = new VBox();
        dobContainer.getChildren().addAll(dobFieldTitle, dobField);
        
        // from
        Label fromFieldTitle = new Label("From");
        fromFieldTitle.setPadding(new Insets(0, 0, 4, 0));
        TextField fromField = new TextField();
        
        VBox fromContainer = new VBox();
        fromContainer.getChildren().addAll(fromFieldTitle, fromField);
        
        // to
        Label toFieldTitle = new Label("To");
        toFieldTitle.setPadding(new Insets(0, 0, 4, 0));
        TextField toField = new TextField();
        
        VBox toContainer = new VBox();
        toContainer.getChildren().addAll(toFieldTitle, toField);
        
        // date
        Label dateFieldTitle = new Label("Date");
        dateFieldTitle.setPadding(new Insets(0, 0, 4, 0));
        DatePicker dateField = new DatePicker();
        
        VBox dateContainer = new VBox();
        dateContainer.getChildren().addAll(dateFieldTitle, dateField);
        
        // email
        Label emailFieldTitle = new Label("Email");
        emailFieldTitle.setPadding(new Insets(0, 0, 4, 0));
        TextField emailField = new TextField();
        
        VBox emailContainer = new VBox();
        emailContainer.getChildren().addAll(emailFieldTitle, emailField);
        
        // status text
        Label statusTxt = new Label("");
        statusTxt.setWrapText(true);
        
        // book btn
        Button bookBtn = new Button();
        bookBtn.setText("BOOK");
        bookBtn.setFont(Font.font("Verdana", FontWeight.BOLD, 16));
        bookBtn.setOnAction(e -> {
            String name = passengerInfoField.getText();
            String from = fromField.getText();
            String to = toField.getText();
            LocalDate dateValue = dateField.getValue();
            
            if (!name.equals("") && !from.equals("") && !to.equals("") && dateValue != null) {
                String formattedDate = dateValue.format(DateTimeFormatter.ISO_DATE);
                
                statusTxt.setText("Dear " + name + ",\n\nYour booking from " + from + " to " + to + " is confirmed on " + formattedDate);
                statusTxt.setFont(Font.font("Verdana", FontWeight.NORMAL, 16));
                statusTxt.setTextFill(Color.BLUE);
            } else {
                statusTxt.setText("Please fill the following fields:\n    • Passenger Information\n    • Date of Birth\n    • From\n    • To\n    • Date");
                statusTxt.setFont(Font.font("Verdana", FontWeight.NORMAL, 16));
                statusTxt.setTextFill(Color.RED);
            }
            
        });
        
        // clear btn
        Button clearBtn = new Button();
        clearBtn.setText("CLEAR");
        clearBtn.setFont(Font.font("Verdana", FontWeight.BOLD, 16));
        clearBtn.setOnAction(e -> {
            passengerInfoField.setText("");
            dobField.setValue(null);
            fromField.setText("");
            toField.setText("");
            dateField.setValue(null);
            emailField.setText("");
            statusTxt.setText("");
        });
        
        HBox buttonsArea = new HBox();
        buttonsArea.setSpacing(16);
        buttonsArea.getChildren().addAll(bookBtn, clearBtn);
        
        formBody.getChildren().addAll(passengerInfoContainer,
                dobContainer,
                fromContainer,
                toContainer,
                dateContainer,
                emailContainer,
                buttonsArea,
                statusTxt
        );
        
        root.getChildren().addAll(
                titleSection,
                formBody
        );
        
        Scene scene = new Scene(root, 600, 728);
        
        primaryStage.setTitle("Simple Form");
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
