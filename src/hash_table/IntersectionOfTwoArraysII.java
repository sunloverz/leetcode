package hash_table;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArraysII {
  public int[] intersect(int[] nums1, int[] nums2) {
    HashMap<Integer, Integer> map1 = new HashMap<>();
    ArrayList<Integer> list = new ArrayList<>();
    for(int num:nums1)
      map1.put(num, map1.getOrDefault(num, 0)+1);
    for(int num:nums2) {
      if(map1.containsKey(num) && map1.get(num) > 0) {
        list.add(num);
        map1.put(num, map1.getOrDefault(num, 1)-1);
      }
    }
    int[] ans = new int[list.size()];
    for(int i=0;i<list.size();i++)
      ans[i] = list.get(i);
    return ans;
  }
}
