package offers.Binaries;


//162 find peak element
public class OneHundredAndSixtyTwo {
    public int solution(int[] nums) {
        return peak(nums, 0, nums.length - 1);
    }

    public int peak(int[] nums,int left,int right) {
        if (left == right) {
            return left;
        }

        int mid = (right - left) / 2 + left;

        if (nums[mid] > nums[mid + 1]) {
            return peak(nums, left, mid);
        }
        return peak(nums, mid + 1, right);
    }
}
