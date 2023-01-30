package day11.task2;

public class Paladin extends Hero implements PhysAttack,Healer{
    public Paladin(){
        this.magicDef = 0.2;
        this.physDef = 0.5;
        this.physAtt = 15;
    }

    @Override
    public void healHimself() {
        health += 25;
        if(health > 100){
            int res = health - 100;
            health -= res;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health += 10;
        if(hero.health > 100){
            int res = hero.health - 100;
            hero.health -= res;
        }
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
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
