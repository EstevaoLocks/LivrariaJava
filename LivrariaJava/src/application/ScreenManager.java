package application;

import enums.Screens;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class ScreenManager {

	// Border pane que tera conteudo trocado
    private static BorderPane mainPane;

    // Define BorderPane
    public static void setMainPane(BorderPane pane) {
        mainPane = pane;
    }

    // Troca de telas
    public static void changeScreen(Screens screen) {
        try {
            FXMLLoader loader = new FXMLLoader(ScreenManager.class.getResource("../view/" + screen.getFxml()));
            Parent root = loader.load();
            mainPane.setCenter(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }// end changeScreen
    
}// end ScreenManager
