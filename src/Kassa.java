import java.util.Scanner;

public class Kassa {
	Boolean open = true;
	static double kermisOmzet;
	static int verkochteKaartjesTotaal;
	Attractie botsautos = new Botsautos();
	Attractie spin = new Spin();
	Attractie spiegelpaleis = new Spiegelpaleis();
	Attractie spookhuis = new Spookhuis();
	Attractie hawaii = new Hawaii();
	Attractie ladderklimmer = new Ladderklimmer();
	
	Scanner scanner = new Scanner(System.in);
	
	Kassa() {
		
	}
	
	
	void controlPanel() {
		while (open == true) {
			System.out.print("Voer nummer van attractie in:");
			
			String input = scanner.next();
			
			switch(input) {
			case "1":
				botsautos.kaartjeVerkopen();
				break;
			case "2":
				spin.kaartjeVerkopen();
				break;
			case "3":
				spiegelpaleis.kaartjeVerkopen();
				break;
			case "4":
				spookhuis.kaartjeVerkopen();
				break;
			case "5":
				hawaii.kaartjeVerkopen();
				break;
			case "6":
				ladderklimmer.kaartjeVerkopen();
				break;
			case "q":
				System.out.println("De kermis is nu gesloten");
				open = false;
				break;
			case "o":
				System.out.println("Omzet per attractie:");
				System.out.println(botsautos.naam + ": €" + botsautos.attractieOmzet);
				System.out.println(spin.naam + ": €" + spin.attractieOmzet);
				System.out.println(spiegelpaleis.naam + ": €" + spiegelpaleis.attractieOmzet);
				System.out.println(spookhuis.naam + ": €" + spookhuis.attractieOmzet);
				System.out.println(hawaii.naam + ": €" + hawaii.attractieOmzet);
				System.out.println(ladderklimmer.naam + ": €" + ladderklimmer.attractieOmzet);
				System.out.println("Totale omzet is: €" + kermisOmzet);
				break;
			case "k":
				System.out.println("Aantal verkochte kaartjes per attractie:");
				System.out.println(botsautos.naam + ": " + botsautos.verkochteKaartjes);
				System.out.println(spin.naam + ": " + spin.verkochteKaartjes);
				System.out.println(spiegelpaleis.naam + ": " + spiegelpaleis.verkochteKaartjes);
				System.out.println(spookhuis.naam + ": " + spookhuis.verkochteKaartjes);
				System.out.println(hawaii.naam + ": " + hawaii.verkochteKaartjes);
				System.out.println(ladderklimmer.naam + ": " + ladderklimmer.verkochteKaartjes);
				System.out.println("Totaal aantal verkochte kaartjes: " + verkochteKaartjesTotaal);
			}
		}
		scanner.close();
		
		
	}
}
