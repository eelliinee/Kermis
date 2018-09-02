
public abstract class RisicoRijkeAttractie extends Attractie {

	private int draaiLimiet;
	boolean goedgekeurd;
	int gedraaidSindsKeuring;

	RisicoRijkeAttractie(String naam, double prijs, int capaciteit, int draaiLimiet) {
		super(naam, prijs, capaciteit);
		this.draaiLimiet = draaiLimiet;
	}
	
	boolean opstellingsKeuring() {
		System.out.println("De attractie is nu klaar om open te gaan.");
		return true;
	}
	
	
}
