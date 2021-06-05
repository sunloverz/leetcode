package array;

import java.util.HashMap;

public class LeetCodeArray {
  public int solution(int A, int B, int K) {
    int b = B/K, a = 0;
    if (A > 0) {
      a = (A - 1) / K;
    }
    else {
      // If A == 0 we need to count
      // it in because 0 is divisible by any positive number
      b++;
    }
    return b - a;
  }
}
