import java.util.*;

public class Solution {
    public List<List<String>> findDuplicate() {

        Map<String, List<String>> map = new HashMap<>();

        String[] paths = new String[0];
        for (int i = 0; i < paths.length; i++) {
            String path = paths[i];
            String[] split = path.split(" ");
            for (int j = 1; j < split.length; j++) {
                String s = split[j];
                int index = s.indexOf("(");
                String fileName = s.substring(0, index);
                String content = s.substring(index + 1, s.length() - 1);
                List<String> list = map.get(content);
                if (list == null) {
                    list = new ArrayList<>();
                    map.put(content, list);
                }
                list.add(split[0] + "/" + fileName);
                System.out.println(fileName);
            }
        }
        List<List<String>> result = new ArrayList<>();
        Iterator<Map.Entry<String, List<String>>> iterator = map.entrySet().iterator();
        while (((Iterator<?>) iterator).hasNext()) {
            Map.Entry<String, List<String>> next = iterator.next();
            if (next.getValue().size() >= 2) {
                result.add(next.getValue());
            }
        }
        return result;
    }
}