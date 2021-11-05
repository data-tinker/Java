import java.util.*;

// https://docs.oracle.com/javase/7/docs/api/java/util/Deque.html

public class QueueTest {
    private static void addQueue() {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.offer(1);
        System.out.println(q);
    }

    private static void removeQueue() {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        System.out.println(q.poll());
        System.out.println(q.size());
    }

    private static void peekQueue() {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        System.out.println(q.peek());
        System.out.println(q.size());
    }

    public static void main(String[] args) {
        addQueue();
        removeQueue();
        peekQueue();
    }
}
