package controller;

//Local
import enums.Screens;
import application.ScreenManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CadastrarController{

	// Componentes
	@FXML
	private Button btnVoltar;
	@FXML
	private Button btnSubmit;
	
	// Navegacao de telas
	@FXML
    private void goHome(ActionEvent event) {
        ScreenManager.changeScreen(Screens.HOME);
    }
    @FXML
    private void goListar(ActionEvent event) {
        ScreenManager.changeScreen(Screens.LISTAR);
    }
    // end navegacao
    
}// end CadastrarController
