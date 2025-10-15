package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Livraria");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/FXMLMain.fxml"));
        BorderPane root = loader.load();

        Scene scene = new Scene(root, 640, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}