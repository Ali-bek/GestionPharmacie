package sample.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.Donnes.donnesPharmacie;
import sample.Models.Client;

public class ClientModification implements Initializable{

    @FXML
    private TextField nomfield;

    @FXML
    private TextField prenomfield;

    @FXML
    private TextField agefield;

    @FXML
    private TextField numfield;

    @FXML
    private TextField maladiefield;

    @FXML
    private TextField traitementfield;

    public void initClient(Client cl) {
    	nomfield.setText(cl.getNom());
    	prenomfield.setText(cl.getPrenom());
    	agefield.setText(Integer.toString(cl.getAge()));
    	numfield.setText(cl.getNum_ss());
    	maladiefield.setText(cl.getMaladie());
    	traitementfield.setText(cl.getTraitement());
    }
    
    @FXML
    void Annuler(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("/sample/Views/Client.fxml"));
    	Scene scene = new Scene(root);
    	
    	Stage window = (Stage) ((Node) ( event.getSource())).getScene().getWindow();
    	window.setScene(scene);
    	window.show();
    }

    @FXML
    void EnregistrerModification(ActionEvent event) throws IOException {
    	
    	int i = 0;
    	for(i=0;i<donnesPharmacie.listClient.size();i++) {
    		if(donnesPharmacie.listClient.get(i).getNom().equals(nomfield.getText())) {
    			donnesPharmacie.listClient.get(i).setNum_ss(numfield.getText());
    			donnesPharmacie.listClient.get(i).setMaladie(maladiefield.getText());
    			donnesPharmacie.listClient.get(i).setTraitement(traitementfield.getText());
    			break;
    		}
    	}
    	
    	Parent root = FXMLLoader.load(getClass().getResource("/sample/Views/Client.fxml"));
    	Scene scene = new Scene(root);
    	
    	Stage window = (Stage) ((Node) ( event.getSource())).getScene().getWindow();
    	window.setScene(scene);
    	window.show();
    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		nomfield.setEditable(false);
		prenomfield.setEditable(false);
		agefield.setEditable(false);
	}

}
