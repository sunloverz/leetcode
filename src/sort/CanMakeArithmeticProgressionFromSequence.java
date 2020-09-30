package sort;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {
  public boolean canMakeArithmeticProgression(int[] arr) {
    Arrays.sort(arr);
    int prev = arr[1] - arr[0];
    for(int i=2;i<arr.length;i++) {
      int num = arr[i]-arr[i-1];
      if(num != prev) return false;
      prev = num;
    }
    return true;
  }
}
