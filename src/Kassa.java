import java.util.Scanner;

public class Kassa {
	Boolean open = true;
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
				botsautos.draaien();
				break;
			case "2":
				spin.draaien();
				break;
			case "3":
				spiegelpaleis.draaien();
				break;
			case "4":
				spookhuis.draaien();
				break;
			case "5":
				hawaii.draaien();
				break;
			case "6":
				ladderklimmer.draaien();
				break;
			}
		}
		scanner.close();
		
		
	}
}
