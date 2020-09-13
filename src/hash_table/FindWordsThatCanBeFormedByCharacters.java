package hash_table;

import java.util.HashMap;

public class FindWordsThatCanBeFormedByCharacters {
  public int countCharacters(String[] words, String chars) {
    int[] charsMap = new int[26];
    int len = 0;
    for(Character ch:chars.toCharArray()) {
      charsMap[ch - 'a']++;
    }
    for(String word:words) {
      int[] wordsMap = new int[26];
      for(char ch:word.toCharArray()) {
        wordsMap[ch - 'a']++;
      }
      boolean contains = true;
      for(int j=0;j<26;j++) {
        if (charsMap[j] < wordsMap[j]) {
          contains = false;
          break;
        }
      }
      if(contains) len += word.length();
    }
    return len;
  }
}
