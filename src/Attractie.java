
abstract public class Attractie {
	protected String naam;
	protected double prijs;
	protected int oppervlakte;
	
	Attractie(String naam, double prijs) {
		this.naam = naam;
		this.prijs = prijs;
	}
	
	void draaien() {
		System.out.println("De attractie " + naam + " draait.");
	}

}
