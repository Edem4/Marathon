package day0;

import java.util.ArrayList;
import java.util.List;

public class Oriol {
    private static String oriol = "\uD83D\uDFE6";

    public static String getOriol() {
        return oriol;
    }
    public static void add(String[][] field) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (field[i][j].equals("\uD83D\uDEE5")) {
                    for (int o = 0; o < 8; o++) {
                        try {
                            switch (o) {
                                case 0:
                                    if (field[i - 1][j - 1].equals("⬜")) {
                                        field[i - 1][j - 1] = getOriol();
                                    }
                                    break;
                                case 1:
                                    if (field[i - 1][j].equals("⬜")) {
                                        field[i - 1][j] = getOriol();
                                    }
                                    break;
                                case 2:
                                    if (field[i - 1][j + 1].equals("⬜")) {
                                        field[i - 1][j + 1] = getOriol();
                                    }

                                    break;
                                case 3:
                                    if (field[i][j + 1].equals("⬜")) {
                                        field[i][j + 1] = getOriol();
                                    }

                                    break;
                                case 4:
                                    if (field[i + 1][j + 1].equals("⬜")) {
                                        field[i + 1][j + 1] = getOriol();
                                    }

                                    break;
                                case 5:
                                    if (field[i + 1][j].equals("⬜")) {
                                        field[i + 1][j] = getOriol();
                                    }

                                    break;
                                case 6:
                                    if (field[i + 1][j - 1].equals("⬜")){
                                        field[i + 1][j - 1] = getOriol();
                                    }
                                    break;
                                case 7:
                                    if (field[i][j - 1].equals("⬜")) {
                                        field[i][j - 1] = getOriol();
                                    }
                                    break;
                            }
                        } catch (IndexOutOfBoundsException e) {
                            continue;
                        }
                    }
                }
            }
        }
    }

}
