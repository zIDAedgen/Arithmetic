import java.util.Arrays;
/*
public class InsertionSort {
    public static void main (String[] args) {
        int[] array = {5, 2, 1, 6 ,3, 7 ,4};
        insertionSort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void insertionSort(int[] arr) {
        // [5, 2, 1, 6, 3, 7, 4]
        for (int i = 1; i < arr.length; i++) {
            int temp;
            temp = arr[i];
            int j = i - 1;
            //while (temp < arr[j] && j >= 0)
            while (j >= 0 && temp < arr[j])
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
}

 */

public class InsertionSort {

    private static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
}

