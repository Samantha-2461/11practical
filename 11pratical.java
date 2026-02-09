import java.util.HashMap;
import java.util.Map;

public class 11practical {
    public static void main(String[] args) {
        int N = 5; 
        int[] shuffled = new int[N];

        
        for (int b = 0; b < N; b++) {
            shuffled[b] = b + 1;
        }

        
        Map<String, Integer> D = new HashMap<>();
        String key1 = "132"; 

        if (!D.containsKey(key1)) {
            D.put(key1, 1);
        } else {
            D.put(key1, D.get(key1) + 1);
        }

        
        for (String key : D.keySet()) {
            System.out.println(key + ", " + D.get(key));
        }
    }
}

