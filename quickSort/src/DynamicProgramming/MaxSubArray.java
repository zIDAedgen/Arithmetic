package DynamicProgramming;



//offer 42
public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,2,-5,4};
        System.out.print(maxSubArray(arr));
    }


    //base case  : dp[0] = nums[0]
    // dp[i] = max {dp[i - 1] + nums[i], nums[i]}
    private static int maxSubArray(int nums[]) {
        int opt = nums[0];
        for (int i = 1; i < nums.length; i++ ) {
            nums[i] = Math.max(nums[i - 1] + nums[i], nums[i]);
            opt = Math.max(opt, nums[i]);
        }
        return opt;
    }


}
