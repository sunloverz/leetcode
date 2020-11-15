package array;

import java.util.HashMap;

public class MajorityElement {
  public int majorityElement(int[] nums) {
    int len = nums.length/2;
    HashMap<Integer, Integer> hash = new HashMap<>();
    for(int num:nums)
      hash.put(num, hash.getOrDefault(num, 0)+1);
    for(int key:hash.keySet()) {
      int val = hash.get(key);
      if(val>len) return key;
    }
    return 0;
  }
}
