package dynamic_programming;

public class UniquePaths {
  public static int uniquePaths(int m, int n) {
    int[][] memo = new int[101][101];
    return helper(memo, m-1, n-1);
  }

  public static int helper(int[][] memo, int m, int n){
    if(m==0 || n ==0) {
      return 1;
    } else if(m<0 || n<0) {
      return 0;
    } else if (memo[m][n] > 0) {
      return memo[m][n];
    }
    memo[m][n] = helper(memo, m-1, n) + helper(memo, m, n-1);
    return memo[m][n];
  }

  public static void main(String[] args) {
    uniquePaths(51, 9);
    System.out.println();
  }
  }
