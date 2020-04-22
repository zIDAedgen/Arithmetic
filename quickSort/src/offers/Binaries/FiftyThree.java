package offers.Binaries;

public class FiftyThree {
    public int search(int[] nums, int target) {

        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] <= target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        int right = i;

        i = 0;
        j = nums.length - 1;

        while (i <= j) {
            int mid = (i + j) / 2;

            if (nums[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        int left = j;

        return right - left - 1;
    }
}
