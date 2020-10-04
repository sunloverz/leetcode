package hash_table;

import java.util.ArrayList;
import java.util.HashMap;

public class UncommonWordsFromTwoSentences {
  public String[] uncommonFromSentences(String A, String B) {
    HashMap<String, Integer> map = new HashMap<>();
    ArrayList<String> list = new ArrayList<>();
    for(String str:A.split("\\s+")){
      map.put(str, map.getOrDefault(str, 0) + 1);
    }
    for(String str:B.split("\\s+")){
      map.put(str, map.getOrDefault(str, 0) + 1);
    }
    for(String str:map.keySet()) {
      if(map.get(str) == 1) {
        list.add(str);
      }
    }

    return list.toArray(String[]::new);
  }
}
