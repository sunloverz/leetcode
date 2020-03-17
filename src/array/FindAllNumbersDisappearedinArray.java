package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedinArray {

  public static void main(String[] args) {
    int[] nums = new int[]{4,3,2,7,8,2,3,1};
    System.out.println(findDisappearedNumbers(nums));
  }

  public static List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> list = new ArrayList<>();
    for(int num:nums){
      int val = Math.abs(num) - 1;
      if(nums[val]>0) nums[val] = -nums[val];
    }
    for(int i=0;i<nums.length;i++)
      if(nums[i]>0) list.add(i+1);
    return list;
  }
}
