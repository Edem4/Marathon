package day0;

import java.util.Scanner;

public class Valid {

    public static int[] coordinates(int shipModel) {
        Scanner scanner = new Scanner(System.in);
        int[] XY;
        while (true) {
            String[] str = scanner.next().split("[.,:;()?!\"\\s-]+");
            XY = new int[str.length];
            try {
                if (XY.length != shipModel * 2) {
                    throw new ValidShipException("Неверное количесно координат для "+ shipModel+"-палубного корабля!");
                }
                for (int i = 0; i < XY.length; i++) {
                    if (Integer.parseInt(str[i]) > 9 || Integer.parseInt(str[i]) < 0)
                        throw new ValidShipException("Неверно указаны координаты, координаты должны быть от 0 до 9");
                    XY[i] = Integer.parseInt(str[i]);
                }
                break;
            } catch (ValidShipException e) {
                System.out.println(e.getMessage());
                continue;
            }
        }
        int[] numXY = XY;
        return numXY;
    }

    public static int[] coordinates() {
        Scanner scanner = new Scanner(System.in);
        int[] XY;
        while (true) {
            String[] str = scanner.next().split("[.,:;()?!\"\\s-]+");
            XY = new int[str.length];
            try {
                if (XY.length !=  2) {
                    throw new ValidShipException("Неверное количесно координат для атаки " +
                            "Формат ввода (x,y)");
                }
                for (int i = 0; i < XY.length; i++) {
                    if (Integer.parseInt(str[i]) > 9 || Integer.parseInt(str[i]) < 0)
                        throw new ValidShipException("Неверно указаны координаты, координаты должны быть от 0 до 9");
                    XY[i] = Integer.parseInt(str[i]);
                }
                break;
            } catch (ValidShipException e) {
                System.out.println(e.getMessage());
                continue;
            }
        }
        int[] numXY = XY;
        return numXY;
    }
}
