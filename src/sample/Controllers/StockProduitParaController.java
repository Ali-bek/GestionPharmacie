package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class StockProduitParaController implements Initializable {

    @FXML
    private TextField TypeField;

    @FXML
    private TextField PrixField;

    @FXML
    private TextField QuantiteField;

    @FXML
    private TextField RechercheField;

    @FXML
    private TableView<?> TableProduit;

    @FXML
    void AjouterProduit(ActionEvent event) {

    }

    @FXML
    void ModifierProduit(ActionEvent event) {

    }

    @FXML
    void SupprimerProduit(ActionEvent event) {

    }

    @FXML
    void retour(ActionEvent event) {

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
}
