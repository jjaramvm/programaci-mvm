package com.mycompany.desenvolupamentaplicaciovisualderobots;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RobotController extends Application {

    private Robot robot = new Robot();
    private Label estatLabel = new Label();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Control del Robot");

        Button mouEndavantButton = new Button("Endavant");
        Button mouEnrereButton = new Button("Enrere");
        Button giraEsquerraButton = new Button("Esquerra");
        Button giraDretaButton = new Button("Dreta");

        mouEndavantButton.setOnAction(e -> {
            robot.mouEndavant();
            actualitzarEstat();
        });
        mouEnrereButton.setOnAction(e -> {
            robot.mouEnrere();
            actualitzarEstat();
        });
        giraEsquerraButton.setOnAction(e -> {
            robot.giraEsquerra();
            actualitzarEstat();
        });
        giraDretaButton.setOnAction(e -> {
            robot.giraDreta();
            actualitzarEstat();
        });

        HBox hbox = new HBox(10, mouEndavantButton, mouEnrereButton, giraEsquerraButton, giraDretaButton);
        BorderPane root = new BorderPane();
        root.setCenter(hbox);
        root.setBottom(estatLabel);

        Scene scene = new Scene(root, 400, 300);

        primaryStage.setScene(scene);
        primaryStage.show();
        actualitzarEstat(); // Mostrar l'estat inicial
    }

    private void actualitzarEstat() {
        estatLabel.setText(robot.getEstat());
    }

    public static void main(String[] args) {
        launch(args);
    }
}