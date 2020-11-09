package array;

import java.util.ArrayList;

public class QueriesOnPermutationWithKey {
  public int[] processQueries(int[] queries, int m) {
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> arr = new ArrayList<>();

    for(int i=1;i<=m;i++) list.add(i);
    for(int i=0;i<queries.length;i++) {
      for(int j=0;j<list.size();j++) {
        if(list.get(j) == queries[i]) {
          arr.add(j);
          list.remove(j);
          list.add(0, queries[i]);
        }
      }
    }
    int[] res = new int[arr.size()];
    for(int i=0;i<arr.size();i++) res[i] = arr.get(i);
    return res;
  }
}
