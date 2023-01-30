package day0;

import java.util.Random;
import java.util.Scanner;

public class PlayField {
    private String name;
    private String[][] field;
    private PlayField mapAction;
    private int countShip;
    private static int players = 0;

    public PlayField() {
        this.field = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                field[i][j] = "⬜";
            }
        }
        players++;
        createName();

        String icon = "\uD83D\uDFE9";
        if (players == 2) {
            icon = "\uD83D\uDFE8";
        }
        mapAction = new PlayField(icon);
    }

    private PlayField(String icon) {
        field = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                field[i][j] = icon;
            }
        }
    } //Конструктор для создания карты атак игрока


    public void incrementCountShip() {
        this.countShip++;
    }

    public int getPlayers() {
        return players;
    }

    private void createName() {
        System.out.println("Игрок №" + getPlayers() + " введите свое имя:");
        Scanner scan = new Scanner(System.in);
        this.name = scan.next();
    }

    public void addElementField(int x, int y, String icon) {
        this.field[x][y] = icon;
    }

    public String getName() {
        return name;
    }

    public String[][] getField() {
        return field;
    }

    public int getCountShip() {
        return countShip;
    }

    private static void print(PlayField obj) {
        for (String[] lines : obj.field) {
            for (String icons : lines) {
                System.out.print(icons);
            }
            System.out.println("");
        }
    }

    public void placementShip() {
        System.out.println("Начнем расставлять корабли на поле " + getName() + "! Другой игрок не смотри!!!");
        Ships.add(this, 4);
        Ships.add(this,3);
        Ships.add(this,3);
        Ships.add(this,2);
        Ships.add(this,2);
        Ships.add(this,2);
        Ships.add(this,1);
        Ships.add(this,1);
        Ships.add(this, 1);
        Ships.add(this, 1);

        System.out.println("ПОЛЕ С ВАШИМИ КОРАБЛЯМИ");
        print(this);
        System.out.println("КАРТА ВАШИХ АТАК");
        print(this.mapAction);
        toExtend();
    }

    public static void play(PlayField player1, PlayField player2) {
        if (random() == 1) {
            System.out.println("**********Начнем игру!**********");
            System.out.println("Первым атакует " + player1.getName());
            player1.attackEnemy(player2);
            return;
        }
        System.out.println("**********Начнем игру!**********");
        System.out.println("Первым атакует " + player2.getName());
        player2.attackEnemy(player1);

    }

    public void attackEnemy(PlayField opponent) {
        outerLoop:
        while (true) {
            if(opponent.getCountShip() == 0){
                winner(this,opponent);
                break;
            }
            System.out.println(this.getName() + " Введи координаты для аттаки:");
            int[] numXY = Valid.coordinates();

            try {

                if (opponent.field[numXY[0]][numXY[1]].equals("\uD83D\uDEE5")) {
                    for (int i = 0; i < 4; i++) {
                        try {
                            switch (i) {
                                case 0:
                                    if (opponent.field[numXY[0]][numXY[1] + 1].equals("\uD83D\uDEE5") ||
                                            opponent.field[numXY[0]][numXY[1] + 2].equals("\uD83D\uDEE5")) {

                                        this.hitShip(numXY, "hit", opponent);
                                        continue outerLoop;

                                    }
                                    break;
                                case 1:
                                    if (opponent.field[numXY[0] - 1][numXY[1]].equals("\uD83D\uDEE5") ||
                                            opponent.field[numXY[0] - 2][numXY[1]].equals("\uD83D\uDEE5")) {

                                        this.hitShip(numXY, "hit", opponent);
                                        continue outerLoop;
                                    }

                                    break;
                                case 2:
                                    if (opponent.field[numXY[0]][numXY[1] - 1].equals("\uD83D\uDEE5") ||
                                            opponent.field[numXY[0]][numXY[1] - 2].equals("\uD83D\uDEE5")) {

                                        this.hitShip(numXY, "hit", opponent);
                                        continue outerLoop;
                                    }
                                    break;
                                case 3:
                                    if (opponent.field[numXY[0] + 1][numXY[1]].equals("\uD83D\uDEE5") ||
                                            opponent.field[numXY[0] + 2][numXY[1]].equals("\uD83D\uDEE5")) {

                                        this.hitShip(numXY, "hit", opponent);
                                        continue outerLoop;
                                    }
                                    break;
                            }

                        } catch (IndexOutOfBoundsException e) {
                            continue;
                        }
                    }
                    opponent.countShip--;
                    hitShip(numXY, "drowned", opponent);
                    continue outerLoop;

                }else if(opponent.field[numXY[0]][numXY[1]].equals("❌")|| opponent.field[numXY[0]][numXY[1]].equals("\uD83D\uDFE5")){

                    hitShip(numXY, "replay", opponent);
                    continue outerLoop;

                }else {
                    this.hitShip(numXY, "missed", opponent);
                    opponent.attackEnemy(this);
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue outerLoop;
            }
        }
    }

    private static void clearConsol() {
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
    }

    private static void toExtend() {
        System.out.println("Нажмите Enter что бы продолжить");
        Scanner scan = new Scanner(System.in);
        if (scan.nextLine().equals("")) {
            clearConsol();
        }
    }

    private static int random() {
        return (int) Math.round(Math.random() + 1);
    }
    private void winner(PlayField player, PlayField opponent){
        clearConsol();
        System.out.println("Поздравляю " + player.getName() + "! Вы победили!!!");
        print(player);
        System.out.println("");
        print(opponent);
    }

    private void hitShip(int[] XY, String resultAttack, PlayField opponent) {
        switch (resultAttack) {
            case "hit":
                System.out.println("Попадание!");
                this.mapAction.field[XY[0]][XY[1]] = "❌";
                opponent.field[XY[0]][XY[1]] = "❌";

                break;
            case "missed":
                System.out.println("Мимо!");
                this.mapAction.field[XY[0]][XY[1]] = "\uD83D\uDFE5";
                opponent.field[XY[0]][XY[1]] = "\uD83D\uDFE5";

                break;
            case "drowned":
                System.out.println("Утопил! " + "Количество кораблей противника: " + opponent.getCountShip());
                this.mapAction.field[XY[0]][XY[1]] = "❌";
                opponent.field[XY[0]][XY[1]] = "❌";
                break;
            case "replay":
                System.out.println("По этим координатам вы уже атаковали!");
        }
        print(this.mapAction);
//        print(this);
//        print(opponent);
    }
}


