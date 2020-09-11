package hash_table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MinimumIndexSumOfTwoList {
  public String[] findRestaurant(String[] list1, String[] list2) {
    HashMap<String, Integer> map = new HashMap<>();
    HashMap<String, Integer> answer = new HashMap<>();
    ArrayList<String> list = new ArrayList<>();
    int min = Integer.MAX_VALUE;

    for(int i=0;i<list1.length;i++)
      map.put(list1[i], i);

    for(int i=0;i<list2.length;i++) {
      String str = list2[i];
      if(map.containsKey(str)) {
        int number = i+answer.get(str);
        answer.put(str, number);
        min = Math.min(min, number);
      }
    }
    for(String str:answer.keySet()){
      if(answer.get(str) == min) {
        list.add(str);
      }
    }

    return list.toArray(String[]::new);
  }
}
