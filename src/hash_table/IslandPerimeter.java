package hash_table;

public class IslandPerimeter {
  public int islandPerimeter(int[][] grid) {
    int[][] grid2 = new int[grid.length +2][grid[0].length+2];
    for(int i=0;i<grid.length;i++) {
      for(int j=0;j<grid[i].length;j++){
        grid2[i+1][j+1] = grid[i][j];
      }
    }

    int per = 0;
    for(int i=1;i<grid2.length-1;i++) {
      for(int j=1;j<grid2[i].length-1;j++) {
        if(grid2[i][j] ==1 ){
          if(grid2[i-1][j]==0) {
            per++;
          }
          if(grid2[i][j-1]==0) {
            per++;
          }
          if(grid2[i+1][j]==0) {
            per++;
          }
          if(grid2[i][j+1]==0) {
            per++;
          }
        }
      }
    }

    return per;
  }
}
