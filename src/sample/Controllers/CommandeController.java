package sample.Controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CommandeController {
    @FXML
    private TextField ProduitField;

    @FXML
    private TextField QuantiteField;

    @FXML
    private TextField NomClField;

    @FXML
    private TextField NomFournisseurField;

    @FXML
    private TextField RechercheField;

    @FXML
    void AjouterCommande(ActionEvent event) {

    }

    @FXML
    void ModifierCommande(ActionEvent event) {

    }

    @FXML
    void SupprimerCommande(ActionEvent event) {

    }

    @FXML
    void retour(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("/sample/Views/Menu.fxml"));
    	Scene scene = new Scene(root);
    	
    	Stage window = (Stage) ((Node) ( event.getSource())).getScene().getWindow();
    	window.setScene(scene);
    	window.show();
    }
}
