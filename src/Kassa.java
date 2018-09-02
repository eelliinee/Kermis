import java.util.Scanner;

public class Kassa {
	Boolean open = false;
	static double kermisOmzet;
	static int verkochteKaartjesTotaal;
	Attractie botsautos = new Botsautos();
	RisicoRijkeAttractie spin = new Spin();
	Attractie spiegelpaleis = new Spiegelpaleis();
	Attractie spookhuis = new Spookhuis();
	RisicoRijkeAttractie hawaii = new Hawaii();
	Attractie ladderklimmer = new Ladderklimmer();
	Monteur henk = new Monteur();
	
	Scanner scanner = new Scanner(System.in);
	
	Kassa() {
		
	}
	
	void kermisOpenen() {
		System.out.println("Wilt u de kermis openen? Voer dan eerst de opstellingskeuringen (o) uit.");
		String input = scanner.next();
		if (input.equals("o")) {
			spin.goedgekeurd = spin.opstellingsKeuring();
			hawaii.goedgekeurd = hawaii.opstellingsKeuring();
			System.out.println("U kunt nu de kermis openen (o).");
			String input2 = scanner.next();
			if (input2.equals("o")) {
				open = true;
				controlPanel();
			}
		}
		
	}
	
	void controlPanel() {
		while (open == true) {
			System.out.print("Voer nummer van attractie in:");
			
			String input = scanner.next();
			
			// switch voor controle paneel
			// refactor later
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
				System.out.println(botsautos.naam + ": �" + botsautos.attractieOmzet);
				System.out.println(spin.naam + ": �" + spin.attractieOmzet);
				System.out.println(spiegelpaleis.naam + ": �" + spiegelpaleis.attractieOmzet);
				System.out.println(spookhuis.naam + ": �" + spookhuis.attractieOmzet);
				System.out.println(hawaii.naam + ": �" + hawaii.attractieOmzet);
				System.out.println(ladderklimmer.naam + ": �" + ladderklimmer.attractieOmzet);
				System.out.println("Totale omzet is: �" + kermisOmzet);
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
				break;
			case "m":
				System.out.println("Welke attractie moet gekeurd worden? Hawaii(h) of Spin(s)");
				String input2 = scanner.next();
				switch (input2) {
				case "h":
					henk.tussentijdseKeuring(hawaii);
					break;
				case "s":
					henk.tussentijdseKeuring(spin);
					break;
				}
				
			}
		}
		scanner.close();
		
		
	}
}
