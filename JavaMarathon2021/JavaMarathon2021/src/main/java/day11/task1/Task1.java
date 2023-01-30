package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse wildberry = new Warehouse();
        Picker edem = new Picker(wildberry);;
        Courier dima = new Courier(wildberry);



    }
    static void businessProcess(Worker worker){
        for(int i = 1;i<10000;i++){
            worker.doWork();
        }
        worker.bonus();
    }
}
