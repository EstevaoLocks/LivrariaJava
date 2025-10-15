package controller;

//Local
import enums.Screens;
import application.ScreenManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

	//Border Pane base
    @FXML
    private BorderPane mainPane;
    @FXML
    private Button btnHome;
    @FXML
    private Button btnCadastrar;
    @FXML
    private Button btnListar;

    //Navegacao de telas
    @FXML
    private void goHome(ActionEvent event) {
        ScreenManager.changeScreen(Screens.HOME);
    }
    @FXML
    private void goListar(ActionEvent event) {
        ScreenManager.changeScreen(Screens.LISTAR);
    }
    @FXML
    private void goCadastrar(ActionEvent event) {
        ScreenManager.changeScreen(Screens.CADASTRAR);
    }// end navegacao

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Registra o pane principal no ScreenManager
        ScreenManager.setMainPane(mainPane);

        // Tela inicial
        ScreenManager.changeScreen(Screens.HOME);
    }
}