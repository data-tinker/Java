import java.util.*;

public class ArrayTest {
    private static void createArray() {
        int[] arr = new int[3];
        System.out.println(arr.length);
        arr[0] = 1;
        System.out.println(Arrays.toString(arr));

        int[] brr = {1, 2};
        System.out.println(brr.length);
        System.out.println(Arrays.toString(brr));
    }

    private static void twoDimensionalArray() {
        char[][] arr = {
            {'a', 'b'},
            {'c', 'd'}
        };

        System.out.println(Arrays.deepToString(arr));
    }

    private static void arrayWithObjects() {
        Integer[] arr = new Integer[3];
        arr[0] = new Integer(3);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        createArray();
        twoDimensionalArray();
        arrayWithObjects();
    }
}
