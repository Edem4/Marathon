package day0;

import java.util.ArrayList;
import java.util.List;

public class Ships {
    private String icon = "\uD83D\uDEE5";

    private int x;
    private int y;

    private Ships(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private String getIcon() {
        return icon;
    }

    private int getX() {
        return x;
    }

    private int getY() {
        return y;
    }

    public static void add(PlayField player,int shipModel) {
        switch (shipModel) {
            case 4:
                System.out.println("Введите координаты четырехпалубного корабля (формат: x,y;x,y;x,y;x,y)");
                break;
            case 3:
                System.out.println("Введите координаты трехпалубного корабля (формат: x,y;x,y;x,y)");
                break;
            case 2:
                System.out.println("Введите координаты двухпалубного корабля (формат: x,y;x,y)");
                break;
            case 1:
                System.out.println("Введите координаты однопалубного корабля (формат: x,y)");
                break;
        }

        int[] numXY = Valid.coordinates(shipModel);
        List<Ships> createShip = new ArrayList<>();

        try {
            switch (shipModel) {
                //  ************* ЧЕТЫРЕХПАЛУБНЫЙ КОРАБЛЬ ***************
                case 4:
                    if (numXY[0] == numXY[2] && numXY[4] == numXY[6] && numXY[0] == numXY[6]) {
                        if (numXY[1] != numXY[3] - 1 || numXY[5] != numXY[7] - 1 || numXY[1] != numXY[7] - 3) {
                            throw new ValidShipException("Не валидный корабль, корабль должен быть одним целым");
                        }

                    } else if (numXY[1] == numXY[3] && numXY[5] == numXY[7] && numXY[1] == numXY[7]) {
                        if (numXY[0] != numXY[2] - 1 || numXY[4] != numXY[6] - 1 || numXY[0] != numXY[6] - 3) {
                            throw new ValidShipException("Не валидный корабль, корабль должен быть одним целым");
                        }

                    } else {
                        throw new ValidShipException("Не валидный корабль, корабль должен быть на одной линии (вертикально или горизонтально)");
                    }
                    createShip = shipAssembly(numXY,shipModel);
                    break;
                //  ************* ТРЕХПАЛУБНЫЙ КОРАБЛЬ ***************
                case 3:
                    if (numXY[0] == numXY[2] && numXY[2] == numXY[4]) {
                        if (numXY[1] != numXY[3] - 1 || numXY[3] != numXY[5] - 1) {
                            throw new ValidShipException("Не валидный корабль, корабль должен быть одним целым");
                        }

                    } else if (numXY[1] == numXY[3] && numXY[3] == numXY[5]) {
                        if (numXY[0] != numXY[2] - 1 || numXY[2] != numXY[4] - 1) {
                            throw new ValidShipException("Не валидный корабль, корабль должен быть одним целым");
                        }

                    } else {
                        throw new ValidShipException("Не валидный корабль, корабль должен быть на одной линии (вертикально или горизонтально)");
                    }
                    createShip = shipAssembly(numXY,shipModel);
                    break;
                //  ************* ДВУХПАЛУБНЫЙ КОРАБЛЬ ***************
                case 2:
                    if (numXY[0] == numXY[2]) {
                        if (numXY[1] != numXY[3] - 1) {
                            throw new ValidShipException("Не валидный корабль, корабль должен быть одним целым");
                        }

                    } else if (numXY[1] == numXY[3]) {
                        if (numXY[0] != numXY[2] - 1) {
                            throw new ValidShipException("Не валидный корабль, корабль должен быть одним целым");
                        }

                    } else {
                        throw new ValidShipException("Не валидный корабль, корабль должен быть на одной линии (вертикально или горизонтально)");
                    }
                    createShip = shipAssembly(numXY,shipModel);
                    break;
                //  ************* ОДНОПАЛУБНЫЙ КОРАБЛЬ ***************
                case 1:
                    createShip = shipAssembly(numXY,shipModel);
            }

            for (Ships ship : createShip) {
                if (player.getField()[ship.getX()][ship.getY()].equals("⬜")) {

                    player.addElementField(ship.getX(),ship.getY(), ship.getIcon());

                } else if (player.getField()[ship.getX()][ship.getY()].equals("\uD83D\uDFE6")) {
                    throw new ValidShipException("Вокруг корабля должна быть область шириной в одну клетку, в которой" +
                            "не может быть других кораблей (ореол корабля)");
                } else {
                    throw new ValidShipException("По данным координатам уже определен корабль");
                }
            }
            player.incrementCountShip();
            Oriol.add(player.getField());
        } catch (ValidShipException e) {
            System.out.println(e.getMessage());
            add(player,shipModel);
        }
    }

    public static List<Ships> shipAssembly(int[] coordinates, int shipModel) {
        List<Ships> s = new ArrayList<>();
        for (int i = 0; i < shipModel * 2; i += 2) {
            s.add(new Ships(coordinates[i], coordinates[i + 1]));
        }
        return s;
    }
    //    public void addShip(int shipModel) {
//        switch (shipModel) {
//            case 4:
//                System.out.println("Введите координаты четырехпалубного корабля (формат: x,y;x,y;x,y;x,y)");
//                break;
//            case 3:
//                System.out.println("Введите координаты трехпалубного корабля (формат: x,y;x,y;x,y)");
//                break;
//            case 2:
//                System.out.println("Введите координаты двухпалубного корабля (формат: x,y;x,y)");
//                break;
//            case 1:
//                System.out.println("Введите координаты однопалубного корабля (формат: x,y)");
//                break;
//        }
//        Scanner scanner = new Scanner(System.in);
//        String[] str = scanner.next().split("[.,:;()?!\"\\s-]+");
//        int[] numXY = new int[str.length];
//
//
//        try {
//            for (int i = 0; i < str.length; i++) {
//                if (Integer.parseInt(str[i]) > 9 || Integer.parseInt(str[i]) < 0)
//                    throw new ValidShipException("Неверно указаны координаты, координаты должны быть от 0 до 9");
//                numXY[i] = Integer.parseInt(str[i]);
//            }
//            if (numXY.length != shipModel * 2) {
//                throw new ValidShipException("Неверное количесно координат");
//            }
//            switch (shipModel) {
//                case 4:
//                    if (numXY[0] == numXY[2] && numXY[4] == numXY[6] && numXY[0] == numXY[6]) {
//                        if (numXY[1] != numXY[3] - 1 || numXY[5] != numXY[7] - 1 || numXY[1] != numXY[7] - 3) {
//                            throw new ValidShipException("Не валидный корабль, корабль должен быть одним целым");
//                        }
//
//                    } else if (numXY[1] == numXY[3] && numXY[5] == numXY[7] && numXY[1] == numXY[7]) {
//                        if (numXY[0] != numXY[2] - 1 || numXY[4] != numXY[6] - 1 || numXY[0] != numXY[6] - 3) {
//                            throw new ValidShipException("Не валидный корабль, корабль должен быть одним целым");
//                        }
//
//                    } else {
//                        throw new ValidShipException("Не валидный корабль, корабль должен быть на одной линии (вертикально или горизонтально)");
//                    }
//                    s.add(new Ships(numXY[0], numXY[1]));
//                    s.add(new Ships(numXY[2], numXY[3]));
//                    s.add(new Ships(numXY[4], numXY[5]));
//                    s.add(new Ships(numXY[6], numXY[7]));
//                    break;
//                case 3:
//                    if (numXY[0] == numXY[2] && numXY[2] == numXY[4]) {
//                        if (numXY[1] != numXY[3] - 1 || numXY[3] != numXY[5] - 1) {
//                            throw new ValidShipException("Не валидный корабль, корабль должен быть одним целым");
//                        }
//
//                    } else if (numXY[1] == numXY[3] && numXY[3] == numXY[5]) {
//                        if (numXY[0] != numXY[2] - 1 || numXY[2] != numXY[4] - 1) {
//                            throw new ValidShipException("Не валидный корабль, корабль должен быть одним целым");
//                        }
//
//                    } else {
//                        throw new ValidShipException("Не валидный корабль, корабль должен быть на одной линии (вертикально или горизонтально)");
//                    }
//                    s.add(new Ships(numXY[0], numXY[1]));
//                    s.add(new Ships(numXY[2], numXY[3]));
//                    s.add(new Ships(numXY[4], numXY[5]));
//                    break;
//                case 2:
//                    if (numXY[0] == numXY[2]) {
//                        if (numXY[1] != numXY[3] - 1) {
//                            throw new ValidShipException("Не валидный корабль, корабль должен быть одним целым");
//                        }
//
//                    } else if (numXY[1] == numXY[3]) {
//                        if (numXY[0] != numXY[2] - 1) {
//                            throw new ValidShipException("Не валидный корабль, корабль должен быть одним целым");
//                        }
//
//                    } else {
//                        throw new ValidShipException("Не валидный корабль, корабль должен быть на одной линии (вертикально или горизонтально)");
//                    }
//                    s.add(new Ships(numXY[0], numXY[1]));
//                    s.add(new Ships(numXY[2], numXY[3]));
//                    break;
//                case 1:
//                    s.add(new Ships(numXY[0], numXY[1]));
//
//            }
//            for (Ships ship: s) {
//                if (this.field[ship.getX()][ship.getY()].equals("⬜")) {
//
//                    this.field[ship.getX()][ship.getY()] = ship.getIcon();
//
//                } else if (this.field[ship.getX()][ship.getY()].equals("\uD83D\uDFE6")) {
//                    throw new ValidShipException("Вокруг корабля должна быть область шириной в одну клетку, в которой" +
//                            "не может быть других кораблей (ореол корабля)");
//                } else {
//                    throw new ValidShipException("По данным координатам уже определен корабль");
//                }
//            }
//            Oriol.add(this.field);
//            countShip++;
//        } catch (ValidShipException e) {
//            System.out.println(e.getMessage());
//            addShip(shipModel);
//        }
//    }
}
