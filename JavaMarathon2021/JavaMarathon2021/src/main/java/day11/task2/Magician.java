package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    public Magician() {
        this.magicDef = 0.8;
        this.physDef = 0;
        this.magicAtt = 20;
        this.physAtt = 5;
    }


    @Override
    public void magicalAttack(Hero hero) {
        if(hero.health < magicAtt){
            hero.health -= hero.health;
            return;
        }
        hero.health -= magicAtt - magicAtt * hero.magicDef;
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
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
