package sample.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import sample.Donnes.donnesPharmacie;
import sample.Models.Client;

public class ClientController implements Initializable {

    @FXML
    private TextField NomField;

    @FXML
    private TextField PrenomField;

    @FXML
    private TextField AgeField;

    @FXML
    private TextField NumssField;

    @FXML
    private TextField MaladieField;

    @FXML
    private TextField TraitementField;

    @FXML
    private TextField RechercheField;
    
    @FXML
    private TableView<Client> ClientTable;
    
    @FXML
    private TableColumn<Client,String> Nom;
    @FXML
    private TableColumn<Client,String> Prenom;
    @FXML
    private TableColumn<Client,String> NumSS;

    @FXML
    void AfficherClient(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(getClass().getResource("/sample/Views/ClientDetail.fxml"));
    	Parent root = loader.load();
    	Scene scene = new Scene(root);
    	
    	ClientDetail controller = loader.getController();
    	controller.initClient(ClientTable.getSelectionModel().getSelectedItem());
    	
    	Stage window = (Stage) ((Node) ( event.getSource())).getScene().getWindow();
    	window.setScene(scene);
    	window.show();
    }

    @FXML
    void AjouterClient(ActionEvent event) {
    	Client cl = new Client(NomField.getText(), PrenomField.getText(), AgeField.getLength(), NumssField.getText(),
    			MaladieField.getText(), TraitementField.getText());
    	
        ObservableList<Client> list = donnesPharmacie.listClient;
        boolean bool = false;
        
        // verifie si le client existe déjà
        int i=0;
    	while(i<list.size() & bool != true) {
    		if(list.get(i).getNom().equals(cl.getNom()) ) {
    			bool=true;
    		}
    		i++;
    	}
    	
        if (bool == true) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("ERROR");
            alert.setHeaderText(null);
            alert.setContentText("Le client existe deja");
            alert.showAndWait();
        }
        else {
            list.add(cl);
            ClientTable.setItems(list);
        }
    }

    @FXML
    void ModifierClient(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(getClass().getResource("/sample/Views/ClientModification.fxml"));
    	Parent root = loader.load();
    	Scene scene = new Scene(root);
    	
    	ClientModification controller = loader.getController();
    	controller.initClient(ClientTable.getSelectionModel().getSelectedItem());
    	
    	Stage window = (Stage) ((Node) ( event.getSource())).getScene().getWindow();
    	window.setScene(scene);
    	window.show();
    }

    @FXML
    void SupprimerClient(ActionEvent event) {
    	// supprimer Client
    	
        Client cl = ClientTable.getSelectionModel().getSelectedItem();
        donnesPharmacie.listClient.remove(cl);
    }

    @FXML
    void retour(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("/sample/Views/Menu.fxml"));
    	Scene scene = new Scene(root);
    	
    	Stage window = (Stage) ((Node) ( event.getSource())).getScene().getWindow();
    	window.setScene(scene);
    	window.show();
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		    Nom.setCellValueFactory(new PropertyValueFactory<Client, String>("nom"));
	        Prenom.setCellValueFactory(new PropertyValueFactory<Client, String>("prenom"));
	        NumSS.setCellValueFactory(new PropertyValueFactory<Client, String>("num_ss"));
		
	        ClientTable.setItems(donnesPharmacie.listClient);
	}
}
