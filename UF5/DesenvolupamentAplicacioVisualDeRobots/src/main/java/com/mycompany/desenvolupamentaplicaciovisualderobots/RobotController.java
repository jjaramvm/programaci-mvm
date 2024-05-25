package com.mycompany.desenvolupamentaplicaciovisualderobots;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RobotController extends Application {

    private Robot robot = new Robot();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Control del Robot");

        Button mouEndavantButton = new Button("Endavant");
        Button mouEnrereButton = new Button("Enrere");
        Button giraEsquerraButton = new Button("Esquerra");
        Button giraDretaButton = new Button("Dreta");

        mouEndavantButton.setOnAction(e -> robot.mouEndavant());
        mouEnrereButton.setOnAction(e -> robot.mouEnrere());
        giraEsquerraButton.setOnAction(e -> robot.giraEsquerra());
        giraDretaButton.setOnAction(e -> robot.giraDreta());

        HBox hbox = new HBox(10, mouEndavantButton, mouEnrereButton, giraEsquerraButton, giraDretaButton);
        BorderPane root = new BorderPane();
        root.setCenter(hbox);

        Scene scene = new Scene(root, 400, 300);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}