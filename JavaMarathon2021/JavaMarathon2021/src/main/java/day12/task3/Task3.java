package day12.task3;

import com.sun.source.tree.NewArrayTree;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> group = new ArrayList<>();
//                Arrays.asList(
//                        new MusicBand(1988, "LP"),
//                        new MusicBand(1999, "skillet"),
//                        new MusicBand(2000, "EE"),
//                        new MusicBand(1997, "edem"),
//                        new MusicBand(1994, "dem"),
//                        new MusicBand(1990, "HT"),
//                        new MusicBand(2010, "LB"),
//                        new MusicBand(2011, "Hollywood"),
//                        new MusicBand(1960, "Bonny M"),
//                        new MusicBand(2003, "rock")
//                ));
        Collections.shuffle(group);


        System.out.println(group);
        System.out.println(groupsAfter2000(group));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> list) {
        List<MusicBand> groupAfter = new ArrayList<>();
        for(MusicBand group:list){
            if(group.getYear() >= 2000){
                groupAfter.add(group);
            }
        }
        return groupAfter;
    }


}
