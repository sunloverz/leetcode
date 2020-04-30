package array;

import java.util.Arrays;

public class ValidMountainArray {
  public static boolean validMountainArray(int[] A) {
    if(A.length < 3) return false;
    int i =1, len = A.length;
    boolean first = false, second = false;
    while(A[i]>A[i-1] && i<len-1) {
      i++;
      first = true;
    }
    if(A[i]<A[i-1]) second = true;
    while(A[i]<A[i-1] && i<len-1){
      i++;
      second = true;
    }
    if(!(A[len-1]<A[len-2])) return false;
    return i==len-1 && first && second;
  }

  public static void main(String[] args) {
//    int[] a = new int[]{6,7,8,9,0,0,0};
    int[] a = new int[]{1,3,2};
    System.out.println(validMountainArray(a));
  }
}
