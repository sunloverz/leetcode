package depth_first_search;

public class FloodFill {
  public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    int color = image[sr][sc];
    dfs(image, sr, sc, color, newColor);
    return image;
  }

  public void dfs(int[][] image, int sr, int sc, int prevColor, int newColor) {
    if(sr < 0 || sr >= image.length) return;
    if(sc < 0 || sc >= image[0].length) return ;
    if(image[sr][sc] != prevColor) return;
    if(image[sr][sc] == newColor) return;
    image[sr][sc] = newColor;
    dfs(image, sr, sc+1, prevColor, newColor);
    dfs(image, sr+1, sc, prevColor, newColor);
    dfs(image, sr-1, sc, prevColor, newColor);
    dfs(image, sr, sc-1, prevColor, newColor);
  }
}
