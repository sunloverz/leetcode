package array;

import java.util.Arrays;

public class RotateLinearArray {
  public static int[] rotateLeft(int[] arr, int k) {
    int length = arr.length;
    k = k % length;
    for(int i=0;i<length/2;i++) {
      int temp = arr[i];
      arr[i] = arr[length-i-1];
      arr[length-i-1] = temp;
    }

    int firstLen = length - k;
    for(int i=0;i<firstLen/2;i++) {
      int temp = arr[i];
      arr[i] = arr[firstLen-i-1];
      arr[firstLen-i-1] = temp;
    }

    int j = 0;
    while(j<k/2) {
      int temp = arr[firstLen+j];
      arr[firstLen+j] = arr[length-j-1];
      arr[length-j-1] = temp;
      j++;
    }

    return arr;
  }

  public static int[] rotateLeft2(int[] arr, int k) {
    int length = arr.length;
    k = k % length;
    reverse(arr, 0, length-1);
    reverse(arr, 0, length -k -1);
    reverse(arr, length-k-1, length-1);
    return arr;
  }

  public static void reverse(int[] arr, int left, int right) {
    if(arr == null) return;
    while(left<right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[]{1,2,3,4,5};
    System.out.println(Arrays.toString(rotateLeft(arr, 2)));
  }

}
