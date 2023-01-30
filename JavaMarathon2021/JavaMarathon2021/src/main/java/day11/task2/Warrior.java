package day11.task2;

public class Warrior extends Hero implements PhysAttack{

    public Warrior() {
        this.magicDef = 0;
        this.physDef = 0.8;
        this.physAtt = 30;
    }

    @Override
    public void physicalAttack(Hero hero) {
        if(hero.health < physAtt){
            hero.health -= hero.health;
            return;
        }
        hero.health -= physAtt - physAtt * hero.physDef;

    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
