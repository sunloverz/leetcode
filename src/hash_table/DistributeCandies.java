package hash_table;

import java.util.HashSet;

public class DistributeCandies {
  public int distributeCandies(int[] candies) {
    HashSet<Integer> sisterCandies = new HashSet<>();
    int max = candies.length/2;
    for(int num:candies) {
      if(sisterCandies.size() < max) {
        sisterCandies.add(num);
      }
    }
    return sisterCandies.size();
  }
}
