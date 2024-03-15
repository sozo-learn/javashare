import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // HashMap (keys, values)
        HashMap<String, String> map = new HashMap<>();
        map.put("pizza", "so good!");
        map.put("lasagna", "how can you say no?");
        map.put("tiramisu", "why not? 😄");

        System.out.println("\niterating through a hashmap");
        // k for (k)ey 😄
        for (String k : map.keySet()) {
            System.out.printf("k: %s, v: %s \n", k, map.get(k));
        }

        System.out.println("\nusing Map.Entry");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.printf("k: %s, v: %s \n", entry.getKey(), entry.getValue());
        }
    }
}
