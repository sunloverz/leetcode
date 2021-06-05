package hash_table;

import java.util.HashMap;

public class FindingTheUsersActiveMinutes {
  public static int[] findingUsersActiveMinutes(int[][] logs, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0;i<logs.length;i++) {
      int id = logs[i][0];
      int time = logs[i][1];
      map.put(time, id);
    }

    int[] arr = new int[k];
    int[] answer = new int[k];
    for(int key:map.keySet()) {
      int val = map.get(key);
      arr[val]++;
    }

    return answer;
  }


  public static void main(String[] args) {
    int[] arr = {5, 5, 5, 0, 0, 0, 5};
    int[][] logs = {{0,5},{1,2},{0,2},{0,5},{1,3}};
    findingUsersActiveMinutes(logs, 5);
  }
}
