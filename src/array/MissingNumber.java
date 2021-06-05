package array;

import java.util.HashSet;

public class MissingNumber {
//  public int missingNumber(int[] nums) {
//    HashSet<Integer> set = new HashSet<>();
//    for(int i=0;i<nums.length;i++){
//      set.add(nums[i]);
//    }
//    for(int i=0;i<=nums.length;i++)
//      if(!set.contains(i)) return i;
//    return -1;
//  }

  public int missingNumber(int[] nums) {
    int total = 0;
    for (int num : nums) {
      total += num;
    }
    int sumWithMissing =0;
    for(int i=0;i<=nums.length;i++)
      sumWithMissing+=i;
    return sumWithMissing - total;
  }
}
