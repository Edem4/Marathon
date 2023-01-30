package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        numGo(0,30,num);
        numGo(300,350,num);
        System.out.println(num);
    }
    private static void numGo(int a, int b, List<Integer> list){
        for(int i = a; i <= b; i++){
            if(i%2 == 0){
                list.add(i);
            }
        }
    }
}
