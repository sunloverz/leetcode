package array;

import java.util.*;

public class SummaryRanges {
  public List<String> summaryRanges(int[] nums) {
    ArrayList<String> list = new ArrayList<>();
    if(nums.length == 0) return list;
    int num = nums[0];
    for(int i=1;i<nums.length;i++) {
      if(nums[i] != nums[i-1]+1) {
        list.add(range(num, nums[i-1]));
        num = nums[i];
      }
    }
    int len = nums.length;
    list.add(range(num, nums[len-1]));
    return list;
  }

  private String range(int first, int second) {
    if(first == second) return String.valueOf(first);
    return first + "->" + second;
  }
}
