package day11.task2;

public class Shaman extends Hero implements PhysAttack,MagicAttack,Healer{
    public Shaman(){
        this.magicDef = 0.2;
        this.physDef = 0.2;
        this.physAtt = 10;
        this.magicAtt = 15;
    }

    @Override
    public void healHimself() {
        health = 50;
        if(health > 100){
            int res = health - 100;
            health -= res;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health += 30;
        if(hero.health > 100){
            int res = hero.health - 100;
            hero.health -= res;
        }
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
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
