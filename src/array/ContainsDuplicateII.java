package array;

import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicateII {
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0;i<nums.length;i++){
      if(map.containsKey(nums[i])){
        int val = map.get(nums[i]);
        if(i-val<=k) return true;
      }
      map.put(nums[i], i);
    }
    return false;
  }

  public static void main(String[] args) {
    int[] f = new int[]{1,2,3};
    int[] s = new int[]{4,5,6};
    int[] t= merge(f,s);
    System.out.println(Arrays.toString(t));
  }

  public static int[] merge(int[] arrLeft, int[] arrRight){
    int len1 = arrLeft.length, len2 = arrRight.length;
    int len = len1+len2;
    int[] arr = new int[len];
    int l=0, r=0, i=0;
    while(i<len && l < len1 && r < len2){
      if(arrRight[r]>arrLeft[l]) {
        arr[i] = arrLeft[l++];
      } else {
        arr[i] = arrRight[r++];
      }
      ++i;
    }
      while(r<len2) arr[i++] = arrRight[r++];
      while(l<len1) arr[i++] = arrLeft[l++];

    return arr;
  }

  public static int[] coupleSum(int[] numbers, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] ans = new int[2];
    for(int i=0;i<numbers.length;i++){
      int val = target - numbers[i];
      if(map.containsKey(val)) {
        ans[0] = map.get(val)+1;
        ans[1]=i+1;
        return ans;
      }
      map.put(numbers[i], i);
    }
    return ans;
  }

  public static boolean isIsomorphic(String input1, String input2) {
    HashMap<Character, Integer> map1 = new HashMap<>();
    HashMap<Character, Integer> map2 = new HashMap<>();
    for(Character ch:input1.toCharArray())
      map1.put(ch, map1.getOrDefault(ch, 0) +1);
    for(Character ch:input2.toCharArray())
      map2.put(ch, map2.getOrDefault(ch, 0) +1);
    Object[] arr1 = map1.values().toArray();
    Object[] arr2 = map2.values().toArray();
    for(int i=0;i<arr1.length;i++)
      if(arr1[i]!=arr2[i]) return false;

    return true;
  }

  public static String insertPairStar(String s) {
    if(s==null) return s;
    if(s.charAt(0) == s.charAt(1))
      return s.substring(0,1) + "*" + insertPairStar(s.substring(1,s.length()));
    else
      return s.substring(0,1) + insertPairStar(s.substring(1,s.length()));
  }

}
