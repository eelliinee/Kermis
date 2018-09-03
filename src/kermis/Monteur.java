package kermis;

public class Monteur {
	void tussentijdseKeuring(RisicoRijkeAttractie attractie) {
		attractie.goedgekeurd = true;
		attractie.gedraaidSindsKeuring = 0;
		System.out.println("Monteur is klaar met keuring van " + attractie.naam);
	}
}
