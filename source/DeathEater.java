public class DeathEater extends Monster implements Combatable {
	public DeathEater(Complex mana) {
		super(mana);
	}

	@Override
	public double getCombatScore() {
		double realscore = getMana().getRe();
		double imagscore = getMana().getIm();
		return Math.sqrt(realscore * realscore + imagscore * imagscore);
	}
}
