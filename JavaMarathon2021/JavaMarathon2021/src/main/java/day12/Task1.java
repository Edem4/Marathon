package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args){
        List<String> auto = new ArrayList<>();
        auto.add("bmw");
        auto.add("audi");
        auto.add("mersedes");
        auto.add("volvo");
        auto.add("ford");
        System.out.println(auto);
        auto.add(3,"volkswagen");
        auto.remove(0);
        System.out.println(auto);
    }

}
