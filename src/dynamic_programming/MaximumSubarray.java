package dynamic_programming;

public class MaximumSubarray {
  public static int maxSubArray(int[] nums) {
    int len = nums.length;
    if(len==1) return nums[0];
    if(len==0) return Integer.MIN_VALUE;
    int[] dp = new int[len];
    dp[0] = nums[0];
    int max = nums[0];
    for(int i=1;i<len;i++) {
      dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
      max = Math.max(max, dp[i]);
    }
    return max;
  }

  public static void main(String[] args) {
    int []mat = {1,2};
    maxSubArray(mat);
  }
}

