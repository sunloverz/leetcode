package string;

import java.util.Arrays;

public class CheckIfStringCanBreakAnotherString {
  public boolean checkIfCanBreak(String s1, String s2) {
    char[] arr1= s1.toCharArray();
    char[] arr2= s2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    boolean more = true;
    boolean less = true;
    for(int i=0;i<arr1.length;i++) {
      if(arr1[i] < arr2[i]) {
        more = false;
      }
      if(arr1[i] > arr2[i]) {
        less = false;
      }
    }

    return more || less;
  }
}

