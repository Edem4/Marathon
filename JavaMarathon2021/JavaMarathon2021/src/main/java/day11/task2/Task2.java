package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Magician magician = new Magician();
        Paladin paladin = new Paladin();
        Warrior warrior = new Warrior();
        Shaman shaman = new Shaman();

        warrior.physicalAttack(paladin);
        System.out.println(paladin);
        paladin.physicalAttack(magician);
        System.out.println(magician);
        shaman.healTeammate(magician);
        System.out.println(magician);
        magician.magicalAttack(paladin);
        System.out.println(paladin);
        shaman.physicalAttack(warrior);
        System.out.println(warrior);
        paladin.healHimself();
        System.out.println(paladin);
        System.out.println("");
        warrior.physicalAttack(magician);
        System.out.println(magician);
        warrior.physicalAttack(magician);
        System.out.println(magician);
        warrior.physicalAttack(magician);
        System.out.println(magician);
        warrior.physicalAttack(magician);
        System.out.println(magician);
        warrior.physicalAttack(magician);
        System.out.println(magician);
    }
}
