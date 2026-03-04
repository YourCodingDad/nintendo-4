package nintendo.test;

import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Console xbox = new Console("Xbox");
		Console playStation = new Console("playStation");
		Console pc = new Console("pc");
		
		Jeu StreetFighter1 = new Jeu("Street Fighter 1",playStation);
		Jeu yakuza0 = new Jeu("Yakuza0", pc);
		Jeu theWitcher3 = new Jeu("The Witcher 3",xbox);
		Jeu skyrimRemastered = new Jeu("Skyrim Remastered", xbox);
		Jeu womanSimulator = new Jeu("Woman Simulator", pc);
		
		Client c1 = new Client("Doe","Jane",);
		Client c2 = new Client("Doe","John");
	}

}
