package string;

import java.util.*;

public class FindAndReplacePattern {
  public List<String> findAndReplacePattern(String[] words, String pattern) {
    List<String> list = new ArrayList<>();
    for(String word:words) {
      if(match(word, pattern))
        list.add(word);
    }
    return list;
  }

  private boolean match(String word, String pattern) {
    Map<Character, Character> wMap = new HashMap();
    Map<Character, Character> pMap = new HashMap();
    for(int i=0;i<word.length();i++) {
      char wordCh = word.charAt(i);
      char parrentCh = pattern.charAt(i);
      if(!wMap.containsKey(wordCh)) wMap.put(wordCh, parrentCh);
      if(!pMap.containsKey(parrentCh)) pMap.put(parrentCh, wordCh);
      if(wMap.get(wordCh)!=parrentCh || pMap.get(parrentCh) != wordCh)
        return false;
    }
    return false;
  }
}

// abbbj
// hdddd
