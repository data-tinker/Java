import java.util.*;

class Pair<T, K> {
    public final T first;
    public final K second;

    public Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other == null || getClass() != other.getClass()) {
            return false;
        }


        Pair<?, ?> otherPair = (Pair<?, ?>) other;

        if (!first.equals(otherPair.first)) {
            return false;
        }

        return second.equals(otherPair.second);
    }

    @Override
    public int hashCode() {
        return 31 * first.hashCode() + second.hashCode();
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

public class PairTest {
    private static Pair<Integer, Integer> testCreation(int first, int second) {
        Pair<Integer, Integer> p = new Pair<>(first, second);
        System.out.println(p.first + " " + p.second);
        return p;
    }

    private static void testSort() {
        Pair<Integer, Integer> a = new Pair<>(3, 4);
        Pair<Integer, Integer> b = new Pair<>(1, 2);

        List<Pair<Integer, Integer>> arr = Arrays.asList(a, b);
        Collections.sort(arr, (lhs, rhs) -> {
            return lhs.first.compareTo(rhs.first);
        });
        System.out.println(arr);
    }

    private static void testHash() {
        Set<Pair<Integer, Integer>> s = new HashSet<>();

        Pair<Integer, Integer> a = new Pair<>(1, 2);
        Pair<Integer, Integer> b = new Pair<>(1, 2);
        s.add(a);
        System.out.println(s.size());
        System.out.println(s.contains(b));
        s.add(b);
        System.out.println(s.size());
        Pair<Integer, Integer> c = new Pair<>(3, 4);
        System.out.println(s.contains(c));
        s.add(c);
        System.out.println(s.contains(c));
    }

    public static void main(String[] args) {
        testCreation(1, 2);
        testSort();
        testHash();
    }
}

