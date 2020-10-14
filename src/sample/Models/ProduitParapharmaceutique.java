package sample.Models;

public class ProduitParapharmaceutique {
	
	private String type;
	private double prix;
	private int qte;
	
	public ProduitParapharmaceutique(String type, double prix, int qte) {
		super();
		this.type = type;
		this.prix = prix;
		this.qte = qte ;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}
	

}
