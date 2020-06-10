package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class KdiffPairsInArray {
  public static int findPairs(int[] nums, int k) {
    if(k<0) return 0;
    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int num:nums) {
      map.put(num, map.getOrDefault(num, 0) +1);
    }
    for(int num:map.keySet()) {
      if(k==0) {
        if(map.get(num) > 1) {
          count++;
        }
      } else if(map.containsKey(num - k)) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    int []array = {1,3,1,5,4};
    findPairs(array, 0);
  }
}
