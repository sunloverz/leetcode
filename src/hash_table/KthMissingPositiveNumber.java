package hash_table;

import java.util.HashSet;

public class KthMissingPositiveNumber {
  public int findKthPositive(int[] arr, int k) {
    HashSet<Integer> set = new HashSet<>();
    for(int num:arr) set.add(num);
    int count = 0;
    for(int i=1;i<=100000;i++) {
      if(!set.contains(i)) {
        count++;
      }
      if(count == k) return i;
    }
    return -1;
  }
}
