
public class Knight extends Fighter {
    public Knight(int baseHp, int wp) {
        super(baseHp , wp);
    }

    @Override
    public double getCombatScore()
    {
        int hp=getBaseHp();
        int weapon=getWp();
        int ground=Battle.GROUND;
        if(Utility.isSquare(ground))
        {
            return (hp * 2 <= 999) ? hp * 2 : 999;
        }
        else
        {
            if(weapon==1)
            {
                return (hp <=999) ? hp : 999;
            }
            else {return    (hp / 10 <= 999) ? (double) hp / 10 : 999;}
        }

    }
}
