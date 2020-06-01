package dynamic_programming;

import java.util.Arrays;

public class HouseRobber {

//  Using recursion and memoization
  public int rob(int[] nums) {
    int[] memo = new int[nums.length+1];
    Arrays.fill(memo, -1);
    return helper(nums, memo, 0);
  }

  private int helper(int[] nums, int[] memo, int i) {
    if(i > nums.length-1) {
      return 0;
    }
    if(memo[i]>0) return memo[i];
    int first = helper(nums, memo, i+1);
    int second = helper(nums, memo, i+2) + nums[i];
    memo[i] = Math.max(first, second);
    return memo[i];
  }

//  Iterative
  public int rob2(int[] nums) {
    int len = nums.length;
    if(len==0) return 0;
    if(len==1) return nums[0];
    int[] dp = new int[len];
    dp[0] = nums[0];
    dp[1] = Math.max(nums[0], nums[1]);
    for(int i=2;i<len;i++){
      dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
    }

    return dp[len-1];
  }

//  Just recursion
  private int helper2(int[] nums, int i) {
    if(i > nums.length-1) {
      return 0;
    }
    int first = helper2(nums, i+1);
    int second = helper2(nums, i+2) + nums[i];
    return Math.max(first, second);
  }
}
