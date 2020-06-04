package dynamic_programming;

public class PalindromicSubstrings {
  public int countSubstrings(String s) {
    int len = s.length();
    int[][] dp = new int[len][len];
    int count = 0;
    for(int i=0;i<len;i++) {
      dp[i][i] = 1;
      count++;
    }
    for(int col=1;col<len;col++){
      for(int row=0;row<col;row++) {
        if(dp[col][row+1]==1 && s.charAt(col) == s.charAt(row)) {
          dp[row][col] = 1;
          count++;
        } else if(dp[row+1][col-1]==1 && s.charAt(col) == s.charAt(row)) {
          dp[row][col] = 1;
          count++;
        }
      }
    }
    return count;
  }
}
