import java.util.*;

class PriorityQueueTest {
    private static void createHeap() {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        minHeap.add(1);
        minHeap.add(2);
        System.out.println(minHeap.peek());
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.offer(1);
        maxHeap.offer(2);
        System.out.println(maxHeap.peek());
    }


    private static void peekHeap() {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        minHeap.offer(1);
        minHeap.offer(2);
        System.out.println(minHeap.peek());
        minHeap.poll();
        System.out.println(minHeap.peek());
    }

    private static void pollHeap() {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        minHeap.offer(1);
        System.out.println(minHeap.poll());
        System.out.println(minHeap.isEmpty());
    }

    public static void main(String[] args) {
        createHeap();
        pollHeap();
    }
}
