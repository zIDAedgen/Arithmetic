import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 6, 8};
        System.out.println(binaryGet(test, 6, 0, 6));
    }


        public static int binaryGet(int[] arr, int target,int left, int right) {
            int mid = (right - left)/2 + left;

            /**
             * The base case dose not have to keep only one : see the code below
             *
             */
            System.out.println("left : " + left + " right : " + right);


            if (arr[mid] == target) {
                return mid;
            }

            if (left == right) {
                return -1;
            }



            if (arr[mid] < target) {
                return binaryGet(arr, target, mid + 1, right);
            }

            if (arr[mid] > target) {
                return binaryGet(arr, target, left, mid - 1);
            }

            return -1;
    }
}
