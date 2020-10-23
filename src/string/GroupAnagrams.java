package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
  public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> list = new ArrayList<>();
    HashMap<String, List<String>> map = new HashMap<>();
    for(String str: strs) {
      String sortedSr = sorted(str);
      List<String> tmp = map.getOrDefault(sortedSr, new ArrayList<>());
      tmp.add(str);
      map.put(sortedSr, tmp);
    }
    for(String key:map.keySet()) {
      list.add(map.get(key));
    }
    return list;
  }

  private String sorted(String str) {
    char[] arr = str.toCharArray();
    Arrays.sort(arr);
    return new String(arr);
  }
}
