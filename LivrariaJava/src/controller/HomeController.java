package controller;

// Local
import application.ScreenManager;
import enums.Screens;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomeController {
	
	// Componentes
	@FXML private Button btnCadastrarLivro;
	@FXML private Button btnListLivros;

	// Navegacao de telas
    @FXML
    private void goCadastrar(ActionEvent event) {
        ScreenManager.changeScreen(Screens.CADASTRAR);
    }
    @FXML
    private void goListar(ActionEvent event) {
        ScreenManager.changeScreen(Screens.LISTAR);
    }// end navegacao
    
}// end HomeController
