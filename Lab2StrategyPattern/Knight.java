package Lab2StrategyPattern;

public class Knight implements Character{
    private AttackStrat attackStrat;
    private DefenseStrat defenseStrat;

    public Knight(){
        this.attackStrat = new SwingSword();
        this.defenseStrat =new Shield();
    }
    
    public void attack(){
        attackStrat.attack();
    }

    public void defend(){
        defenseStrat.defend();
    }
}

