import java.util.Arrays;

public class BubbleSort {


    public int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                        int temp;
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        int[] newArray = {a, b};
        return newArray;
    }

}
