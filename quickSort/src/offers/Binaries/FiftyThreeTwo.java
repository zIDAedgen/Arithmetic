package offers.Binaries;

public class FiftyThreeTwo {
    public int missingNumber(int[] nums) {
        int i = 0, j = nums.length - 1;

        while(i <= j) {
            int mid = (j - i) / 2 + i;
            if (nums[mid] == mid) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }
}
