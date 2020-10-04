package hash_table;

import java.util.*;

public class MinimumDistances {
  static int minimumDistances(int[] a) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int min = Integer.MAX_VALUE;

    for(int i=0;i<a.length;i++) {
      if(map.containsKey(a[i])) {
        min = Math.min(min, i - map.get(a[i]));
      }
      map.put(a[i], i);
    }
    return min == Integer.MAX_VALUE ? -1: min;
  }
}
