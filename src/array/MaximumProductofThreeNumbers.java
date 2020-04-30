package array;

import java.util.Arrays;

public class MaximumProductofThreeNumbers {
  public int maximumProduct1(int[] nums) {
    int max = Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
      for(int j=i+1;j<nums.length;j++){
        for(int k=j+1;k<nums.length;k++){
          max = Math.max(max, nums[i]+nums[j]+nums[k]);
        }
      }
    }
    return max;
  }

  public int maximumProduct(int[] nums) {
    Arrays.sort(nums);
    int len = nums.length;
    return Math.max(nums[0]*nums[1]*nums[len-1],nums[len-1]*nums[len-2]*nums[len-3]);
  }

}
