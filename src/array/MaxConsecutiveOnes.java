package array;

public class MaxConsecutiveOnes {
  public int findMaxConsecutiveOnes(int[] nums) {
    int max =0;
    int count=0;
    for(int num:nums){
      if(num==0){
        max = Math.max(count, max);
        count=0;
      } else {
        count++;
      }
    }
    max = Math.max(count, max);
    return max;
  }
}
