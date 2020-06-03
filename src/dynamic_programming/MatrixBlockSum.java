package dynamic_programming;

public class MatrixBlockSum {

  public static int[][] matrixBlockSum(int[][] mat, int K) {
    int m = mat.length, n = mat[0].length;
    int[][] rangeSum = new int[m + 1][n + 1];
    for (int i = 0; i < m; ++i)
      for (int j = 0; j < n; ++j)
        rangeSum[i + 1][j + 1] = rangeSum[i + 1][j] + rangeSum[i][j + 1] - rangeSum[i][j] + mat[i][j];
    int[][] ans = new int[m][n];
    for (int r = 0; r < m; r++) {
      for (int c = 0; c < n; c++) {
        int r1 = Math.max(0, r - K), c1 = Math.max(0, c - K);
        int r2 = Math.min(m - 1, r + K), c2 = Math.min(n - 1, c + K);
        r1++; c1++; r2++; c2++; // Since `sum` start with 1 so we need to increase r1, c1, r2, c2 by 1
        ans[r][c] = rangeSum[r2][c2] - rangeSum[r2][c1-1] - rangeSum[r1-1][c2] + rangeSum[r1-1][c1-1];
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int [][]mat = {{1,2,3},{4,5,6},{7,8,9}};
    matrixBlockSum(mat, 1);

  }

}

