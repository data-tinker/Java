import java.util.*;

class ListTest {
    private static void createList() {
        List<Integer> li1 = List.of(1, 2, 3);
        System.out.println(li1.size());
        try {
            li1.add(4);
        } catch (Exception e) {
            System.out.println("Cannot modify");
            System.out.println(li1);
        }
        List<Integer> li2 = new ArrayList<>();
        li2.add(3);
        System.out.println(li2);
        System.out.println(li2.size());
    }

    private static void setList() {
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.set(0, 3);
        System.out.println(li);
    }

    private static void getList() {
        List<Integer> li = List.of(1, 2, 3);
        System.out.println(li.get(0));
    }

    private static void removeList() {
        List<Integer> li = new ArrayList<>();
        li.add(3);
        li.add(2);
        li.remove(0);
        System.out.println(li);
        li.clear();

        System.out.println(li.isEmpty());
    }

    private static void twoDimensionalList() {
        List<List<Integer>> li = new ArrayList<>();
        li.add(new ArrayList<>());
        li.get(0).add(1);
        li.add(new ArrayList<>());
        li.get(1).add(2);
        System.out.println(li);
    }

    private static void sortList() {
        List<Integer> li1 = new ArrayList<>();
        li1.add(3);
        li1.add(1);
        li1.add(2);

        Collections.sort(li1);
        System.out.println(li1);

        List<List<Integer>> li2 = new ArrayList<>();
        li2.add(new ArrayList<>());
        li2.get(0).add(3);
        li2.get(0).add(4);
        li2.add(new ArrayList<>());
        li2.get(1).add(1);
        li2.get(1).add(2);
        li2.add(new ArrayList<>());
        li2.get(2).add(1);
        li2.get(2).add(3);
        Collections.sort(li2, (lhs, rhs) -> {
            if (lhs.get(0) == rhs.get(0)) {
                return lhs.get(1) - lhs.get(1);
            }

            return lhs.get(0) - rhs.get(0);
        });
        System.out.println(li2);
    }

    private static void listsEqual() {
        List<Integer> li1 = List.of(1, 2, 3);
        List<Integer> li2 = List.of(1, 2, 3);
        List<Integer> li3 = List.of(3, 2, 1);

        System.out.println(li1.equals(li2));
        System.out.println(li1.equals(li3));
    }

    public static void main(String[] args) {
        createList();
        getList();
        removeList();
        setList();
        twoDimensionalList();
        sortList();
        listsEqual();
    }
}
