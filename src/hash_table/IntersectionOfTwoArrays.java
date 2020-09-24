package hash_table;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfTwoArrays {
  public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> firstSet = new HashSet<>();
    HashSet<Integer> secondSet = new HashSet<>();

    for(int num:nums1) firstSet.add(num);
    for(int num:nums2) secondSet.add(num);
    ArrayList<Integer> list = new ArrayList<>();
    for(int num1:firstSet) {
      boolean contains = false;
      for(int num2:secondSet) {
        if(num2 == num1) {
          contains = true;
          break;
        }
      }
      if(contains) {
        list.add(num1);
      }
    }
    return convertIntegers(list);
  }

  public static int[] convertIntegers(List<Integer> integers)
  {
    int[] ret = new int[integers.size()];
    for (int i=0; i < ret.length; i++)
    {
      ret[i] = integers.get(i).intValue();
    }
    return ret;
  }
}
