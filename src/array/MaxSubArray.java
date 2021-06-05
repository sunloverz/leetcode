package array;

public class MaxSubArray {
  public static int maxSubArray(int[] nums) {

    int n = nums.length;
    int maximumSubArraySum = Integer.MIN_VALUE;
    int start = 0;
    int end = 0;

    for (int left = 0; left < n; left++) {

      int runningWindowSum = 0;

      for (int right = left; right < n; right++) {
        runningWindowSum += nums[right];

        if (runningWindowSum > maximumSubArraySum) {
          maximumSubArraySum = runningWindowSum;
          start = left;
          end = right;
        }
      }
    }
    System.out.println("start "+start);
    System.out.println("end "+end);
//    System.out.println("Found Maximum Subarray between {} and {}", start, end);
    return maximumSubArraySum;
  }

  public static void main(String[] args) {
    System.out.println(maxSubArray(new int[]{-1, -13, -2, 1, -3, 4, -1, 2, 1, -5, 4}));
  }

}
