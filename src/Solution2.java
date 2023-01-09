import java.util.HashMap;
import java.util.Map;

class Solution2 {

    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> count1 = count(words1);
        Map<String, Integer> count2 = count(words2);
        int result = 0;
        for (String w : words1) {
            if (count1.getOrDefault(w, 0) == 1 && count2.getOrDefault(w, 0) == 1) {
                ++result;
            }
        }
        return result;
    }

    public Map<String, Integer> count(String[] words) {
        Map<String, Integer> count3 = new HashMap<>();
        for (String w : words) {
            count3.put(w, count3.getOrDefault(w, 0) + 1);
        }
        System.out.println(count3);
        return count3;

    }
}

