package array;

import java.util.*;

public class PairsOfSongsWithTotalDurations60 {
  public int numPairsDivisibleBy60_2(int[] time) {
    int counter = 0;
    for(int i=0;i<time.length;i++){
      for(int j=i+1;j<time.length;j++){
        if((time[i]+time[j]) % 60 == 0) {
          counter++;
        }
      }
    }
    return counter;
  }
  //  [60, 60, 60]
  public int numPairsDivisibleBy60(int[] time) {
    HashMap<Integer, Integer> hash = new HashMap<>();
    int counter = 0;
    for(int t:time) {
      int num = (60-t%60)%60;
      counter += hash.getOrDefault(num, 0);
      hash.put(t%60,1+hash.getOrDefault(t%60, 0));
    }
    return counter;
  }
}
