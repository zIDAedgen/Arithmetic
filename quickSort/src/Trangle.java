import java.util.Arrays;

public class Trangle {
    static final int[] arr = {1, 2, 3, 4};
    static final double CHARGE = 12.25;
    static int[] array = new int[arr.length];
    public static void main(String[] args) {
        drawTriangle(4);
        recur(0);
        System.out.println(Arrays.toString(array));

    }

    private static void drawTriangle(int row) {
        final int para = row;
        int layer = 1;
        while (layer <= row) {
            System.out.println("");
            layer++;
            int length = 1;
            while (length < layer) {
                System.out.println(length);
                length++;
            }
        }
    }

    private static void recur(int index) {
        if (index > 3) {
            return;
        }
        recur(index + 1);
        array[index] = arr[index];
        return;
    }
}
