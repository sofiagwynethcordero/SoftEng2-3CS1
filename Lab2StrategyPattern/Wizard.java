package Lab2StrategyPattern;

public class Wizard implements Character{
    private AttackStrat attackStrat;
    private DefenseStrat defenseStrat;
    
    public Wizard(){
        this.attackStrat = new CastSpell();
        this.defenseStrat = new CreateMagic();
    }
    
    public void attack(){
        attackStrat.attack();
    }

    public void defend(){
        defenseStrat.defend();
    }
}

