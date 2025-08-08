public class Paladin extends Knight {
	public Paladin(int baseHp, int wp) {
		super(baseHp, wp);
	}

	@Override
	public double getCombatScore() {
		int hp=getBaseHp();
		int f1=0;
		int f2=1;
		int n=1;
		if(hp==0) return 1000;
		while (f2<hp)
		{
			int temp=f1+f2;
			f1=f2;
			f2=temp;
			n++;
		}
		if(f2==hp && n>2)
		{
			return n+1000;
		}

		return  hp * 3;
	}
}
