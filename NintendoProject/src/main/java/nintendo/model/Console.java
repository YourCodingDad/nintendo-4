package nintendo.model;

<<<<<<< HEAD
import java.time.LocalDate;

public class Console {
=======
public abstract class Console {
>>>>>>> origin/main

	private String nom;
	private Integer prix;
	private LocalDate dateSortie;

	public Console(String nom, Integer prix, LocalDate dateSortie) {
		this.nom = nom;
		this.prix = prix;
		this.dateSortie = dateSortie;
	}

	public Console(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Integer getPrix() {
		return prix;
	}

	public void setPrix(Integer prix) {
		this.prix = prix;
	}

	public LocalDate getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(LocalDate dateSortie) {
		this.dateSortie = dateSortie;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + ", prix=" + prix + ", dateSortie=" + dateSortie + "]";
	}


	
}
