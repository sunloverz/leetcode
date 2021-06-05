package array;

import java.util.*;
public class PascalsTriangle {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> first = new ArrayList<>();
    first.add(1);
    List<Integer> second = new ArrayList<>();
    second.add(1);
    second.add(1);
    res.add(first);
    res.add(second);


    return res;
  }
}
