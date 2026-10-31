
package org.example.thaer_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader loader = new FXMLLoader(
                HelloApplication.class.getResource("hello-view.fxml")
        );

        Scene scene = new Scene(loader.load(), 1180, 760);
        scene.setFill(Color.web("#17264D"));

        URL css = HelloApplication.class.getResource("theme.css");

        if (css == null) {
            throw new IOException("theme.css not found!");
        }

        scene.getStylesheets().add(css.toExternalForm());

        stage.setTitle("StudyFlow - Task Manager");
        stage.setMinWidth(1080);
        stage.setMinHeight(740);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
