package dynamic_programming;

public class HouseRobber {
  public int rob(int[] nums) {
    return helper(nums, 0);
  }

  private int helper(int[] nums, int i) {
    if(i > nums.length-1) {
      return 0;
    }
    int first = helper(nums, i+1);
    int second = helper(nums, i+2) + nums[i];
    return Math.max(first, second);
  }
}
