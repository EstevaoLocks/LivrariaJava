package controller;

//Local
import application.ScreenManager;

import enums.Screens;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ListarController {

	// Navegacao de telas
    @FXML
    private void goCadastrar(ActionEvent event) {
        ScreenManager.changeScreen(Screens.CADASTRAR);
    }
    @FXML
    private void goMain(ActionEvent event) {
        ScreenManager.changeScreen(Screens.MAIN);
    }// end navegacao
}