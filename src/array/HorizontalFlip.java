package array;

public class HorizontalFlip {
  public static void flipHorizontalAxis(int[][] matrix) {
    int rows = matrix.length;
    int len = matrix[0].length;
    for(int i=0;i<rows/2;i++){
      for(int j=0;j<len;j++){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[len-i-1][j];
        matrix[len-i-1][j] = temp;
      }
    }
  }
}
