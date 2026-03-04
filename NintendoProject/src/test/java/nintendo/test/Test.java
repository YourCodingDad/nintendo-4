package nintendo.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import nintendo.model.Achat;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Jeu;
import nintendo.model.Salon;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Achat> l1 = new ArrayList();
		List<Achat> l2 = new ArrayList();
		
		
		Boutique jeux_video = new Boutique("Video Futur", "7 rue de la clé 59000 Lille");
		
		Console xbox = new Salon("Xbox");
		Console playStation = new Salon("playStation");
		Console pc = new Salon("pc");
		
		Jeu StreetFighter1 = new Jeu("Street Fighter 1",playStation,jeux_video);
		Jeu yakuza0 = new Jeu("Yakuza0", pc,jeux_video);
		Jeu theWitcher3 = new Jeu("The Witcher 3",xbox,jeux_video);
		Jeu skyrimRemastered = new Jeu("Skyrim Remastered", xbox,jeux_video);
		Jeu womanSimulator = new Jeu("Woman Simulator", pc,jeux_video);
		
		l1.add(new Achat(StreetFighter1,LocalDate.now(),250));
		l2.add(new Achat(skyrimRemastered,LocalDate.now(),10));
		Client c1 = new Client("Doe","Jane", l1);
		Client c2 = new Client("Doe","John",l2);
		
	
		
	}

}
