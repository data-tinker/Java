import java.util.*;

public class SetTest {
    private static void addSet() {
        Set<Integer> s = new HashSet<>();
        s.add(1);

        System.out.println(s.size());
        System.out.println(s.contains(1));
        System.out.println(s);
    }

    private static void containsSet() {
        Set<List<Integer>> s = new HashSet<>();
        List<Integer> li1 = new ArrayList<>();
        li1.add(1);
        List<Integer> li2 = new ArrayList<>();
        li2.add(1);
        List<Integer> li3 = new ArrayList<>();
        li3.add(1);
        li3.add(2);

        s.add(li1);
        System.out.println(s.contains(li2));
        System.out.println(s.contains(li3));
        s.add(li2);
        System.out.println(s.size());
        s.add(li3);
        System.out.println(s);
    }

    private static void removeSet() {
        Set<Integer> s = new HashSet<>();
        s.add(1);

        System.out.println(s.size());
        s.remove(1);
        System.out.println(s.isEmpty());
    }

    private static void setEqual() {
        Set<Integer> s1 = new HashSet<>();
        s1.add(1);

        Set<Integer> s2 = new HashSet<>();
        s2.add(1);

        Set<Integer> s3 = new HashSet<>();
        s3.add(2);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }

    private static void operations() {
        Set<Integer> a = new HashSet<Integer>();

        a.addAll(Arrays.asList(
            new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));

        Set<Integer> b = new HashSet<Integer>();

        b.addAll(Arrays.asList(
            new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));


        // To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set: ");
        System.out.println(union);

        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set: ");
        System.out.println(intersection);

        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set: ");
        System.out.println(difference);
    }

    public static void main(String[] args) {
         addSet();
         containsSet();
         removeSet();
         setEqual();
         operations();
    }
}
