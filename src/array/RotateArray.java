package array;

public class RotateArray {
  public void rotate(int[] nums, int k) {
    int len = nums.length;
    for(int i=0;i<k;i++) {
      int temp = nums[len-1];
      for(int j=len-1;j>0;j--){
        nums[j] = nums[j-1];
      }
      nums[0] = temp;
    }
  }

  public void rotate2(int[] nums, int k) {
    int len = nums.length;
    int[] arr = new int[len];

    for(int i=0;i<len;i++) {
      arr[(i+k)%len] = nums[i];
    }

    for(int i=0;i<len;i++)
      nums[i] = arr[i];

  }

  public void rotate3(int[] nums, int k) {
    k %= nums.length;
    reverse(nums, 0, nums.length-1);
    reverse(nums, 0, k-1);
    reverse(nums, k, nums.length-1);
  }

  public void reverse(int[] nums, int l, int r) {
    while(l<r) {
      int temp = nums[l];
      nums[l] = nums[r];
      nums[r] = temp;
      l++;
      r--;
    }
  }
}

