package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RepeatedElementsInArray {
  public static String duplicate(int[] numbers){
    Arrays.sort(numbers);
    HashSet<Integer> set = new HashSet<>();
    for(int i=0;i<numbers.length-1;i++) {
      if(numbers[i]==numbers[i+1]) {
        set.add(numbers[i]);
      }
    }
    return Arrays.toString(set.toArray());
  }

  public static int findMissingNumber(int[] arr) {
    int[] nums = new int[10];
    for(int num:arr)
      nums[num] = 1;
    for(int i=0;i<nums.length;i++) {
      if(nums[i]==0) return i+1;
    }
    return 0;
  }
}
