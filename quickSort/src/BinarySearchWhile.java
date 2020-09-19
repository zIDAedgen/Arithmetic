import practice.PeakElement;

public class BinarySearchWhile {

    public int binarySearch(int arr[], int target) {

        int start = 0, end = arr.length - 1;

        while (start + 1 < end) {
            int mid = (end - start) / 2 + start;
            if (target == arr[mid]) {
                end = mid;
            } else if (target > arr[mid]) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (arr[start] == target) {
            return start;
        }

        if (arr[end] == target) {
            return end;
        }
        return -1;
    }
}

class BinaryPsudo {
    public static void main(String[] args) {
        int[] test = {1, 3, 4, 5, 6, 8};
        System.out.println(binaryPsudo(test, 4));
    }
    public static int binaryPsudo(int[] arr,int target) {
        int i = 0, j = arr.length - 1;

        while (i <= j) {
            int mid = (j - i) / 2 + i;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }

        }

        if (arr[i] == target) {
            return i;
        }

        if (arr[j] == target) {
            return j;
        }
        return -1;

    }
}
