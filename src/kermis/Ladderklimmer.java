package kermis;

public class Ladderklimmer extends Attractie implements GokAttractie {
	Ladderklimmer() {
		super("Ladderklimmer", 5.00, 1);
	}

	public double kansSpelBelastingBetalen() {
		double belasting = attractieOmzet * 0.3;
		attractieOmzet = attractieOmzet - belasting;
		return belasting;
	}

}
