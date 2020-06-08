package dynamic_programming;
import java.util.*;

public class MinimumCostForTickets {
  public int[] costs;
  public Integer[] memo;
  public Set<Integer> dayset;

  public int mincostTickets(int[] days, int[] costs) {
    this.costs = costs;
    memo = new Integer[366];
    dayset = new HashSet();
    for (int d: days) dayset.add(d);
    return dp(1);
  }

  public int dp(int i) {
    if (i > 365)
      return 0;
    if (memo[i] != null)
      return memo[i];
    int ans;
    if (dayset.contains(i)) {
      ans = Math.min(dp(i+1) + costs[0],
        dp(i+7) + costs[1]);
      ans = Math.min(ans, dp(i+30) + costs[2]);
    } else {
      ans = dp(i+1);
    }
    memo[i] = ans;
    return ans;
  }
  public static void main(String[] args) {
    MinimumCostForTickets mc = new MinimumCostForTickets();
    int[] days = new int[]{1,4,6,7,8,20};
    int[] costs = new int[]{2,7,15};
    mc.mincostTickets(days, costs);
    System.out.println();
  }


}

// [1,4,6,7,8,20]
// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
// [1,2,3,4,5,6,7,8,9,10,30,31]
