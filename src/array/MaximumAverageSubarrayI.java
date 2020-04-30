package array;

public class MaximumAverageSubarrayI {
  public double findMaxAverage(int[] nums, int k) {
    int sum = 0;
    for(int i =0;i<k;i++) sum += nums[i];
    double max = sum;
    for(int i=1;i<nums.length-k+1;i++){
      sum-=nums[i-1];
      sum+=nums[i+k-1];
      max = Math.max(max, sum);
    }
    return max/k;
  }
}
