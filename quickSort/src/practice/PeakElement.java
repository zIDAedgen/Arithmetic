package practice;

//BinarySearch Practice
//nums = [1,2,1,3,5,6,4] return 1 or 5

public class PeakElement {
    public int findPeak(int[] nums) {

        int i = 0, j = nums.length - 1;
        while (i + 1 < j) {
            int mid = (j - i) / 2 + i;
            if (nums[mid] > nums[i] && nums[mid + 1] > nums[mid]) {
                i = mid + 1;
            }

            if (nums[mid] > nums[j] && nums[mid - 1] > nums[mid]) {
                j = mid - 1;
            }
        }

        if (nums[i] > nums[j]) {
            return i;
        }
        return j;
    }
}
