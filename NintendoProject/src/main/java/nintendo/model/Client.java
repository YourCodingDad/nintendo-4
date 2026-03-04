package nintendo.model;

import java.util.List;

public class Client {
	private String nom;
	private String prenom;
	private List<String> listeAchats;
	
	
	
	public Client(String nom, String prenom, List<String> listeAchats) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.listeAchats = listeAchats;
	}

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<String> getListeAchats() {
		return listeAchats;
	}

	public void setListeAchats(List<String> listeAchats) {
		this.listeAchats = listeAchats;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", listeAchats=" + listeAchats + "]";
	}

	
	
}
