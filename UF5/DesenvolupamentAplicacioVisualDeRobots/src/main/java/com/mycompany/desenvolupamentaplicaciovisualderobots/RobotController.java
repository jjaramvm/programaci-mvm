package com.mycompany.desenvolupamentaplicaciovisualderobots;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RobotController extends Application {

    private Robot robot = new Robot();
    private Label estatLabel = new Label();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Control del Robot");

        Button mouEndavantButton = new Button("Moure Endavant");
        Button mouEnrereButton = new Button("Moure Enrere");
        Button giraEsquerraButton = new Button("Girar Esquerra");
        Button giraDretaButton = new Button("Girar Dreta");

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

        HBox fila1 = new HBox(10, mouEndavantButton, mouEnrereButton);
        fila1.getStyleClass().add("hbox");

        HBox fila2 = new HBox(10, giraEsquerraButton, giraDretaButton);
        fila2.getStyleClass().add("hbox");

        VBox vbox = new VBox(10, fila1, fila2);
        vbox.getStyleClass().add("vbox");

        BorderPane root = new BorderPane();
        root.setCenter(vbox);
        root.setBottom(estatLabel);
        root.getStyleClass().add("borderpane");

        Scene scene = new Scene(root, 400, 300);
        scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());

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