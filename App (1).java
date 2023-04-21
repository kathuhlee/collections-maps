import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

    public static void main(String[] args) {
        Map<Integer, String> basicMap = new HashMap<>();
        basicMap.put(1, "Hello");
        basicMap.put(2, "World");
        basicMap.put(3, "Hello");

        Map<String, Integer> basicMap2 = new HashMap<>();

        basicMap2.put("Hello", 1);

        System.out.println(basicMap);
        System.out.println(basicMap2);

        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();

        Map<Integer, Integer> treeMap = new TreeMap<>();

        for(Map.Entry<Integer, String> element : basicMap.entrySet()){
            System.out.println(element.getKey());
            System.out.println(element.getValue());
        }

    }
}