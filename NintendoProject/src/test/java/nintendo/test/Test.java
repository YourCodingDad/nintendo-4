package nintendo.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import nintendo.model.Achat;
import nintendo.model.Client;
import nintendo.model.Boutique;
import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Achat> l1 = new ArrayList();
		List<Achat> l2 = new ArrayList();
		
		Console xbox = new Console("Xbox");
		Console playStation = new Console("playStation");
		Console pc = new Console("pc");
		
		Jeu StreetFighter1 = new Jeu("Street Fighter 1",playStation);
		Jeu yakuza0 = new Jeu("Yakuza0", pc);
		Jeu theWitcher3 = new Jeu("The Witcher 3",xbox);
		Jeu skyrimRemastered = new Jeu("Skyrim Remastered", xbox);
		Jeu womanSimulator = new Jeu("Woman Simulator", pc);
		
		l1.add(new Achat(StreetFighter1,LocalDate.now(),250));
		l2.add(new Achat(skyrimRemastered,LocalDate.now(),10));
		Client c1 = new Client("Doe","Jane", l1);
		Client c2 = new Client("Doe","John",l2);
		Boutique jeux_video = new Boutique("Video Futur", "7 rue de la clé 59000 Lille");
		
	
		
	}

}
