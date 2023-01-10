import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Map<String,Integer> map = new HashMap<>();
        String text = "sssddd asds asdds afggdf aa aa aa aa aa";
        String[] words = text.split("");
        for(String word: words) {
            
            map.putIfAbsent(word, 0);
            map.put(word, map.get(word) + 1);
        }
        System.out.println(map);
    }
}
