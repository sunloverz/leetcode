package array;

public class DistanceBetweenBusStops {
  public  static int distanceBetweenBusStops(int[] distance, int start, int destination) {
    int clockwise = 0;
    int counterclockwise = 0;
    int first = Math.min(start, destination);
    int second = Math.max(start, destination);
    for(int i=first;i<second;i++)
      clockwise += distance[i];

    for(int i=0;i<first;i++)
      counterclockwise += distance[i];
    for(int i=second;i<distance.length;i++)
      counterclockwise += distance[i];

    return Math.min(clockwise, counterclockwise);
  }

  public static void main(String[] args) {
    int[] nums = new int[]{7,10,1,12,11,14,5,0};

    System.out.println(distanceBetweenBusStops(nums,7,2));
  }
}
