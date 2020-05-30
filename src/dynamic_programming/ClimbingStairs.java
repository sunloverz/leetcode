package dynamic_programming;

public class ClimbingStairs {
  int counter = 0;
  int[] memo = new int[10000];
  public int climbStairs(int n) {
    helper(n, 0);
    return counter;
  }
  private void helper(int n, int sum) {
    if(sum == n) {
      counter++;
      return;
    } else if (memo[sum]>0) {
      counter += memo[sum];
      return;
    }
    if(sum>n) return;
    helper(n, sum+1);
    helper(n, sum+2);
    memo[sum] = counter;
  }

  public int climbStairs2(int n) {
    if(n<2) return 1;
    int[] dp = new int[n+1];
    dp[1] = 1;
    dp[2] = 2;
    for(int i=3;i<n+1;i++){
      dp[i] = dp[i-1] + dp[i-2];
    }
    return dp[n];
  }
}
