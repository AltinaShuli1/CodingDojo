package HASHMAP;
import java.util.HashMap;
public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();

        trackList.put("July","I have been holding my breath");
        trackList.put("Barefoot in the park " , "Y me portio el corazon");
        trackList.put("Te miro en la cara" , "Tendria un hijo contigo");
        trackList.put("Nina piensa en ti" , "Estar contigo fue mi unica ilusion");

        String songTitle = "Nina piensa en ti";
        String songLyrics = trackList.get(songTitle);
        System.out.println("Song: " + songTitle);
        System.out.println("Lyrics: " + songLyrics);

        System.out.println("/n All tracks:");
        for(String title : trackList.keySet()){
            String lyrics = trackList.get(title);
            System.out.println("Song : " + title);
            System.out.println("Lyric :"+ lyrics);

        }
    }
}
