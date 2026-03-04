package nintendo.model;

import java.time.LocalDate;

public class Achat {
	
	Jeu jeu;
	LocalDate date;
	double Prix;
	
	
	public Achat(Jeu jeu, LocalDate date, double prix) {
		super();
		this.jeu = jeu;
		this.date = date;
		Prix = prix;
	}


	public Jeu getJeu() {
		return jeu;
	}



	public void setJeu(Jeu jeu) {
		this.jeu = jeu;
	}



	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getPrix() {
		return Prix;
	}

	public void setPrix(double prix) {
		Prix = prix;
	}

	@Override
	public String toString() {
		return "Achat [jeu=" + jeu + ", date=" + date + ", Prix=" + Prix + "]";
	}
	

}
