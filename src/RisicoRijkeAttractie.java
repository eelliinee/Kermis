
public abstract class RisicoRijkeAttractie extends Attractie {

	private int draaiLimiet;
	public boolean goedgekeurd;
	private int gedraaidSindsKeuring;

	RisicoRijkeAttractie(String naam, double prijs, int capaciteit, int draaiLimiet) {
		super(naam, prijs, capaciteit);
		this.draaiLimiet = draaiLimiet;
	}
	
	boolean opstellingsKeuring() {
		System.out.println(naam + " is nu klaar om open te gaan.");
		return true;
	}
	
	void draaien() throws Exception {
		if (gedraaidSindsKeuring < draaiLimiet) {
			gedraaidSindsKeuring++;
			super.draaien();
		} else {
			throw new Exception();
		}
		
	}
}
