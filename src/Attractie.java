
abstract public class Attractie {
	protected String naam;
	protected double prijs;
	protected int oppervlakte;
	public double attractieOmzet;
	public int bezetting;
	protected int capaciteit;
	
	Attractie(String naam, double prijs, int capaciteit) {
		this.naam = naam;
		this.prijs = prijs;
		this.capaciteit = capaciteit;
	}
	
	void kaartjeVerkopen() {
		System.out.println("Ga maar naar binnen.");
		bezetting++;
		if (bezetting == capaciteit) {
			draaien();
		} else {
			System.out.println("Er zit nu " + bezetting + " perso(o)n(en) te wachten.");
			System.out.println("Er moeten nog minimaal " + (capaciteit - bezetting) + " perso(o)n(en) bij voordat we gaan draaien.");
		}
		Kassa.kermisOmzet += prijs;
	//	System.out.println(Kassa.kermisOmzet);
		attractieOmzet += prijs;
	//	System.out.println(naam + attractieOmzet);
	}
	
	void draaien() {
		System.out.println("De attractie " + naam + " draait.");
		bezetting = 0;
		
	}
	

}
