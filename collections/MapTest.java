import java.util.*;

public class MapTest {
    private static void putMap() {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(1, 1);
        m.put(2, 2);
        System.out.println(m);

        m.put(1, 2);
        m.put(2, 3);
        System.out.println(m);
    }

    private static void removeMap() {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(1, 1);
        System.out.println(m);

        m.remove(1);
        System.out.println(m);
        System.out.println(m.isEmpty());
    }

    private static void getMap() {
        Map<Integer, Integer> m = new HashMap<>();
        System.out.println(m.get(1));
        System.out.println(m.getOrDefault(1, 0));

        m.put(1, 1);
        System.out.println(m.get(1));
        System.out.println(m.getOrDefault(1, 0));
    }

    private static void containsKeyMap() {
        Map<Integer, Integer> m = new HashMap<>();
        System.out.println(m.containsKey(1));
    }

    private static void iterateMap() {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(1, 1);
        m.put(2, 2);

        for (Map.Entry<Integer, Integer> kv : m.entrySet()) {
            int key = kv.getKey();
            int value = kv.getValue();

            System.out.print(key + " : " + value + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        putMap();
        removeMap();
        getMap();
        containsKeyMap();
        iterateMap();
    }
}
