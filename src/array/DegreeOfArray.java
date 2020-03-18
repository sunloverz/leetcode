package array;

import java.util.*;

public class DegreeOfArray {
  public int findShortestSubArray(int[] nums) {
    HashMap<Integer, Integer> count = new HashMap<>(), left = new HashMap<>(),
      right = new HashMap<>();
    for(int i=0;i<nums.length;i++){
      left.putIfAbsent(nums[i], i);
      right.put(nums[i], i);
      count.put(nums[i], count.getOrDefault(nums[i], 0)+1);
    }
    int max = Collections.max(count.values());
    int ans = nums.length;
    for(int num:count.keySet())
      if(max == count.get(num))
        ans = Math.min(ans, right.get(num) - left.get(num) +1);
    return ans;
  }
}
