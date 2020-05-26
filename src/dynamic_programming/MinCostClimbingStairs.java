package dynamic_programming;

public class MinCostClimbingStairs {
  public int minCostClimbingStairs(int[] cost) {
    int f1 = cost[0];
    int f2 = cost[1];
    int sum;
    for(int i=2;i<cost.length;i++){
      sum = Math.min(f1, f2) + cost[i];
      f1 = f2;
      f2 = sum;
    }
    return Math.min(f1, f2);
  }

  public int minCostClimbingStairs2(int[] cost) {
    int len = cost.length;
    int[] dp = new int[len];
    dp[0] = cost[0];
    dp[1] = cost[1];
    for(int i=2;i<len;i++)
      dp[i] += Math.min(dp[i-1], dp[i-2]) + cost[i];
    return Math.min(dp[len-1], dp[len-2]);
  }


}
