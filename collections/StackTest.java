import java.util.*;

public class StackTest {
    private static void pushStack() {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        System.out.println(s);
    }

    private static void peekStack() {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        System.out.println(s.peek());
    }

    private static void popStack() {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
    }

    public static void main(String[] args) {
        pushStack();
        peekStack();
        popStack();
    }
}
