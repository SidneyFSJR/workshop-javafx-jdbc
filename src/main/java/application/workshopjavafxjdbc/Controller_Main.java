package application.workshopjavafxjdbc;

import application.workshopjavafxjdbc.gui.util.Alerts;
import com.sun.tools.javac.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller_Main implements Initializable {

    @FXML
    private MenuItem menuItemVendedores;
    @FXML
    private MenuItem menuItemDepartamentos;
    @FXML
    private MenuItem menuItemSobre;

    @FXML
    public void onMenuItemVendedoresAction() {
        System.out.println("onMenuItemVendedoresAction");
    }

    @FXML
    public void onMenuItemDepartamentosAction() {
        System.out.println("onMenuItemDepartamentosAction");
    }

    @FXML
    public void onMenuItemSobreAction() {
        loadView("/application/workshopjavafxjdbc/View_Sobre.fxml");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    private synchronized void loadView(String absoluteName) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
            VBox newVBox = loader.load();

            Scene mainScene = View_Main.getMainScene();
            VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();

            Node mainMenu = mainVBox.getChildren().get(0);
            mainVBox.getChildren().clear();
            mainVBox.getChildren().add(mainMenu);
            mainVBox.getChildren().addAll(newVBox.getChildren());

        } catch (IOException e) {
            Alerts.showAlert("IO Exception", "Erro carregando a página", e.getMessage(), Alert.AlertType.ERROR);
        }

    }



}
