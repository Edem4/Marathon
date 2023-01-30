package day7.day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 20001; i++) {
            str = str + i;
            str += " ";
        }
        long stopTime1 = System.currentTimeMillis();

        System.out.println(str);
        System.out.println(stopTime1 - startTime1);


        long startTime2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(" ");
        for (int i = 0; i < 20001; i++) {
            sb.append(i).append(" ");
        }
        long stopTime2 = System.currentTimeMillis();


        System.out.println(sb);
        System.out.println(stopTime2 - startTime2);
    }
}
