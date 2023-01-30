package day12.task5;


import java.util.List;

public class MusicBand {
    private int year;
    private String name;
    private List<MusicArtist> artists;

    public MusicBand() {
    }

    public MusicBand(String name, int year, List<MusicArtist> list) {
        this.year = year;
        this.name = name;
        this.artists = list;
    }

    public List<MusicArtist> getMembers() {
        return artists;
    }


    public void printMembers(){
        for(MusicArtist art:artists){
            art.toString();
        }
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        b.artists.addAll(a.artists);
        a.artists.removeAll(a.getMembers());
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }


}
