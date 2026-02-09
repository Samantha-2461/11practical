import java.util.HashMap;
import java.util.Map;
public class Practical11 {
        public static void main(String[] args) {
                int N = 5; // Fixed: N must be defined
                int[] shuffled = new int[N];

                // Fixed: Simply filling the array for demonstration
                for (int b = 0; b < N; b++) {
                        shuffled[b] = b + 1;
                }

                // Fixed: D must be declared and instantiated
                Map<String, Integer> D = new HashMap<>();
                String key1 = "132"; // Renamed to avoid shadowing

                if (!D.containsKey(key1)) {
                        D.put(key1, 1);
                } else {
                        D.put(key1, D.get(key1) + 1);
                }

                // Output results
                for (String key : D.keySet()) {
                        System.out.println(key + ", " + D.get(key));
                }
        }
}
