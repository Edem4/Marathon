package day12.task4;


import java.util.List;

public class MusicBand {
    private int year;
    private String name;
    private List<String> members;

    public MusicBand() {
    }

    public MusicBand(String name, int year, List<String> list) {
        this.year = year;
        this.name = name;
        this.members = list;
    }

    public List<String> getMembers() {
        return members;
    }


    public void printMembers(){
        for(String str:members){
            System.out.println(str);
        }
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        b.members.addAll(a.members);
        a.members.removeAll(a.getMembers());
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }


}
