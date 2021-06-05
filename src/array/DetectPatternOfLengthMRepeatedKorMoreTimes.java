package array;

import java.util.Arrays;

public class DetectPatternOfLengthMRepeatedKorMoreTimes {
  public static boolean containsPattern(int[] arr, int m, int k) {
    for(int i=0; i<=arr.length - m; i++){
      int[] pattern = Arrays.copyOfRange(arr,i, i + m);
      int count = 1;
      for(int j=i+m;j<arr.length;j+=m) {
        int[] current = Arrays.copyOfRange(arr, j, j+m);
        if (Arrays.equals(pattern, current)) {
          count++;
        } else {
          break;
        }
        if(count == k) return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] arr = new int[]{1,2,1,2,1,1,1,3};
    arr = new int[]{2,2};
    System.out.println(containsPattern(arr, 1, 2));
  }
}
