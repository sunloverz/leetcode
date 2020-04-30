package array;

public class MaximizeDistanceToClosestPerson {
  public static int maxDistToClosest(int[] seats) {
    int max = Integer.MIN_VALUE;
    int j=0, i;
    for(i=0;i<seats.length;i++){
      if(seats[i]==1 && seats[j]==1) {
        max = Math.max(max,(i-j)/2);
        j=i;
      } else if(seats[i]==1&&seats[j]==0) {
        max = Math.max(max, i-j);
        j=i;
      }
    }
    if(seats[i-1]==0&&seats[j]==1)
      max = Math.max(max, i-j-1);

    return max;
  }

  public static void main(String[] args) {
//    int[] nums = new int[]{1,0,0,1,0,0,0,0,0,0,1};
    int[] nums2 = new int[]{0,0,0,0,1,0,0,1,0,0,0,0,0};
    int[] nums3 = new int[]{1,0,0,0};
    System.out.println(maxDistToClosest(nums2));
  }
}
