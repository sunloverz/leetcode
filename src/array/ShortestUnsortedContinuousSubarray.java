package array;

import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray {
  public int findUnsortedSubarray(int[] nums) {
    int[] arr = nums.clone();
    Arrays.sort(arr);
    int len = nums.length;
    int count = 0;
    for(int i = 0; i<len; i++) {
      if(nums[i] != arr[i]) break;
      count++;
    }
    for(int i = len-1; i>=0; i--) {
      if(nums[i] != arr[i]) break;
      count++;
    }
    int ans = len - count;
    if(ans <0) return 0;
    return ans;
  }
}



