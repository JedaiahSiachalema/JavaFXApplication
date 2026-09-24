package com.example.hellofx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {
// this is the welcome page, or rather, the first part you see when the app has been opened
    private static final String ORIGINAL_MESSAGE = "Welcome, Jedaiah Siachalema!";

    @Override
    public void start(Stage stage) {
        Label message = new Label(ORIGINAL_MESSAGE);

        Button startButton = new Button("Start");
        Button resetButton = new Button("Reset");
        resetButton.setVisible(false); // hidden at first
// this is the code for the message that comes when you click the "click me" button
        startButton.setOnAction(event -> {
            message.setText("Great! You clicked the button.");
            startButton.setVisible(false);
            resetButton.setVisible(true);
        });
// this is for the reset, when you click the button, it changes the message,
// so this is to set it back to the welcome jedaiah screen
        resetButton.setOnAction(event -> {
            message.setText(ORIGINAL_MESSAGE);
            resetButton.setVisible(false);
            startButton.setVisible(true);
        });
// the window
        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(message, startButton, resetButton);

        Scene scene = new Scene(layout, 500, 300);
        stage.setTitle("202508154");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}