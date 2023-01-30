package day11.task1;

public class Picker implements Worker {
    private int salary;
    private Warehouse w;
    private final int SALARY_MAX = 80;
    private boolean isPayed;



    public Picker(Warehouse w) {
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
    @Override
    public void doWork() {
        salary += SALARY_MAX;
        w.incrementPicker();
    }

    @Override
    public void bonus() {
        if (w.getCountPickedOrders() < 10_000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if(isPayed){
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 70000;
        isPayed = true;
    }
}
