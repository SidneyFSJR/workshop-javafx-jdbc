package application.workshopjavafxjdbc;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

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
        System.out.println("onMenuItemSobreAction");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
