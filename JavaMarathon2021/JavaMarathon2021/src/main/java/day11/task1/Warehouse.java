package day11.task1;

public class Warehouse {
    private int countDeliveredOrders = 0;
    private int countPickedOrders = 0;


    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countDeliveredOrders=" + countDeliveredOrders +
                ", countPickedOrders=" + countPickedOrders +
                '}';
    }

    public void incrementDelivery() {
        countDeliveredOrders++;
    }

    public void incrementPicker() {
        countPickedOrders++;
    }

}
