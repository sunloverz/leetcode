package hash_table;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SetMismatch {
  public int[] findErrorNums(int[] nums) {
    int[] ans = new int[2];
    HashSet<Integer> set = new HashSet<>();
    int dup = -1;
    for(int num:nums) {
      if(set.contains(num))
        dup = num;
      set.add(num);
    }
    for(int i=1;i<=nums.length;i++){
      if(!set.contains(i)){
        ans[0] = dup;
        ans[1] = i;
        return ans;
      }
    }
    return ans;
  }
}

