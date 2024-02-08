package Lab2StrategyPattern;

public class Archer implements Character{
    private AttackStrat attackStrat;
    private DefenseStrat defenseStrat;
    
    public Archer(){
        this.attackStrat = new ShootArrow();
        this.defenseStrat = new Dodge();
    }
    
    public void attack(){
        attackStrat.attack();
    }

    public void defend(){
        defenseStrat.defend();
    }
}
