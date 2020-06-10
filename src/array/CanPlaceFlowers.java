package array;

public class CanPlaceFlowers {
  public static boolean canPlaceFlowers(int[] flowerbed, int n) {
    int len = flowerbed.length - 1;
    int count = 0;
    for(int i=0;i<flowerbed.length;i++) {
      int l = Math.max(0, i-1);
      int r = Math.min(len, i+1);
      if(flowerbed[i] ==0 && flowerbed[l] == 0 && flowerbed[r] ==0) {
        flowerbed[i] = 1;
        count++;
      }
    }
    return count >= n;
  }

  public static void main(String[] args) {
    int []flowerbed = {1,0,0,0,1};
    canPlaceFlowers(flowerbed, 2);
  }
}
