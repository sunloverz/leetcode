package hash_table;

import java.util.Arrays;

public class CountPrimes {
  public int countPrimes(int n) {
    int count = 0;
    boolean[] primes = new boolean[n];
    for(int i=2;i<n;i++) {
      if(primes[i]) continue;
      for(int j=2;j<Math.sqrt(i);j++) {
        if(i%j==0) {
          primes[i] = false;
          break;
        }
      }
    }

    for(int i=0;i<n;i++) if(primes[i]) count++;

    return count;
  }
}
