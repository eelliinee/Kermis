import java.util.Scanner;

public class Kassa {
	Boolean open = true;
	double kermisOmzet;
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
			}
		}
		scanner.close();
		
		
	}
}
