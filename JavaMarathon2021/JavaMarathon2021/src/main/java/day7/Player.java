package day7;

public class Player {
    private int stamina;
    final int MAX_STAMINA = 100;
    final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if(Player.countPlayers < 6) {
            Player.countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return Player.countPlayers;
    }
    public void run(){
        if(this.stamina > MIN_STAMINA){
            this.stamina--;
            if(this.stamina == 0){
                Player.countPlayers--;
            }
        }
    }
    public static void info(){
        if(Player.countPlayers < 6){
            System.out.println("Команды неполные. На поле еще есть "
                    +(6 - Player.countPlayers)+
                    " свободных мест");
        }else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
