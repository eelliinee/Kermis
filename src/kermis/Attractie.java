package kermis;

abstract public class Attractie {
	protected String naam;
	protected double prijs;
	protected int oppervlakte;
	public double attractieOmzet;
	public int verkochteKaartjes;
	public int bezetting;
	protected int capaciteit;
	public boolean goedgekeurd;
	
	Attractie(String naam, double prijs, int capaciteit) {
		this.naam = naam;
		this.prijs = prijs;
		this.capaciteit = capaciteit;
	}
	
	void kaartjeVerkopen() {
		System.out.println("Alstublieft, uw kaartje voor " + naam);
		bezetting++;
		if (bezetting >= capaciteit) {
			try {
				draaien();
			} catch (Exception e) {
				System.out.println(naam + " kan nu niet draaien, roep de monteur (m).");
			}
		} else {
			System.out.println("Er zit nu " + bezetting + " perso(o)n(en) te wachten.");
			System.out.println("Er moeten nog minimaal " + (capaciteit - bezetting) + " perso(o)n(en) bij voordat we gaan draaien.");
		}
		Kassa.kermisOmzet += prijs;
		attractieOmzet += prijs;
		Kassa.verkochteKaartjesTotaal++;
		verkochteKaartjes++;
	}
	
	void draaien() throws Exception {
		System.out.println("De attractie " + naam + " draait.");
		bezetting = 0;
		
	}

	

}
