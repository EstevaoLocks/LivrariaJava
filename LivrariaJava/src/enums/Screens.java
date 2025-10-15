package enums;

public enum Screens {
    MAIN("FXMLMain.fxml"),
    HOME("FXMLHome.fxml"),
    LISTAR("FXMLListar.fxml"),
    CADASTRAR("FXMLCadastrar.fxml");

    private final String fxml;

    Screens(String fxml) {
        this.fxml = fxml;
    }

    public String getFxml() {
        return fxml;
    }
}