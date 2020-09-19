import java.util.Arrays;

public class QuickS {
    public static void main(String[] args) {
        int[] array = {2, 1, 6, 8, 3, 0, 4};
        //QuickS.quickSort(array, 0, 6);
        quick(array, 0, 6);
        //System.out.println(Arrays.toString(array));
        System.out.print(Arrays.toString(array));
    }

    public static void quick(int[] array, int left, int right) {

    }















    public static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pointer = low - 1;
        int pivot = arr[high];

        // This Loop make sure that the left side before inserting is always smaller than pivot;
        for(int i = low; i < arr.length; i++) {
            if(arr[i] < pivot) {
                pointer++;
                int temp = arr[i];
                arr[i] = arr[pointer];
                arr[pointer] = temp;
            }
        }

        int chache = arr[pointer + 1];
        arr[pointer + 1] = arr[high];
        arr[high] = chache;

        return pointer + 1;
    }

}
