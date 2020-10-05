package hash_table;

import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings {
  public boolean isIsomorphic(String s, String t) {
    HashMap<Character, Integer> sMap = new HashMap<>();
    HashMap<Character, Integer> tMap = new HashMap<>();
    for(int i=0;i<s.length();i++){
      char ch = s.charAt(i);
      sMap.put(ch, sMap.getOrDefault(ch, 0)+i);
    }
    for(int i=0;i<t.length();i++){
      char ch = t.charAt(i);
      tMap.put(ch, tMap.getOrDefault(ch, 0)+i);
    }
    for(int i=0;i<s.length();i++)
      if(sMap.get(s.charAt(i)) != tMap.get(t.charAt(i)))
        return false;
    return true;
  }
}
