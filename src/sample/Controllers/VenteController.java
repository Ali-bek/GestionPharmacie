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
import javafx.stage.Stage;

public class VenteController implements Initializable{
	
    @FXML
    void VendreProduit(ActionEvent event) {

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
		
	}
	
}
