package array;

import java.util.Arrays;

public class HowManyNumbersAreSmaller {
  public static void main(String[] args) {
    int[] nums = new int[]{8,1,2,2,3};
    Arrays.sort(nums);
    System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
  }

  public static int[] smallerNumbersThanCurrent(int[] nums) {
    int[] ans = new int[nums.length];
    for(int i=0;i<nums.length;i++){
      for(int j=0;j<nums.length;j++){
        if(i!=j && nums[j] < nums[i]){
          ans[i]++;
        }
      }
    }
    return ans;
  }
}

// 8,1,2,2,3
// 1,2,2,3,8
