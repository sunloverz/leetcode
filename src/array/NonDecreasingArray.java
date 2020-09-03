package array;

public class NonDecreasingArray {
  public static boolean checkPossibility(int[] nums) {
    int count = 0;
    int max = Integer.MIN_VALUE;
    for(int i=1;i<nums.length;i++) {
      if(nums[i] < nums[i-1]) {
        count++;
      }
    }
    return count >= 1;
  }

//  [3,4,2,3]
//
  public static void main(String[] args) {
    System.out.println(checkPossibility(new int[]{4,2,3}) );
  }

}
