package sample.Donnes;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.Models.*;

public class donnesPharmacie {
	
	public static ObservableList<Client> listClient = FXCollections.observableArrayList(
			new Client("Faycal", "Gaser", 33, "184216B", "Pas de Maladie Chronique", "Paracetamol et pillule de Vomito")
			);
	
	public static ObservableList<Commande> listCommande = FXCollections.observableArrayList();
	
	public static ObservableList<ProduitParapharmaceutique> listProduitPara = FXCollections.observableArrayList();
}
