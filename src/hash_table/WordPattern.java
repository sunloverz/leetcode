package hash_table;

import java.util.HashMap;

public class WordPattern {
  public boolean wordPattern(String pattern, String s) {
    String[] arr = s.split("\\s+");
    HashMap<Character, String> map = new HashMap<>();
    if (arr.length != pattern.length()) return false;
    for(int i=0;i<pattern.length();i++) {
      char ch = pattern.charAt(i);
      if (map.containsKey(ch)) {
        String str = map.get(ch);
        if (!str.equals(arr[i])) return false;
      } else {
        if (map.containsValue(arr[i])) return false;
        map.put(ch, arr[i]);
      }
    }
    return true;
  }
}
