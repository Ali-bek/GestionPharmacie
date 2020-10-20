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
import javafx.scene.control.Label;
import javafx.stage.Stage;
import sample.Models.Client;

public class ClientDetail implements Initializable {


    @FXML
    private Label NomCl;

    @FXML
    private Label PrenomCl;

    @FXML
    private Label AgeCl;

    @FXML
    private Label NumCl;

    @FXML
    private Label MaladieCl;

    @FXML
    private Label TraitementCl;
    
    public void initClient(Client cl) {
    	NomCl.setText(cl.getNom());
    	PrenomCl.setText(cl.getPrenom());
    	AgeCl.setText(Integer.toString(cl.getAge()));
    	NumCl.setText(cl.getNum_ss());
    	MaladieCl.setText(cl.getMaladie());
    	TraitementCl.setText(cl.getTraitement());
    }
    
    @FXML
    void retour(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("/sample/Views/Client.fxml"));
    	Scene scene = new Scene(root);
    	
    	Stage window = (Stage) ((Node) ( event.getSource())).getScene().getWindow();
    	window.setScene(scene);
    	window.show();
    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
	}

}
