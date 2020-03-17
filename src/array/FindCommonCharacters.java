package array;

import java.util.*;

public class FindCommonCharacters {
  public static List<String> commonChars(String[] A) {
      List<String> list = new ArrayList<>();
      int[] symbols = new int[26];
      for(char ch='a';ch<='z';ch++){
        int min = 1000;
        for(String val:A){
          int count=0;
          for(char s:val.toCharArray()) if(ch==s) count++;
          min = Math.min(count, min);
        }
        symbols[ch-'a'] = min;
      }
      for(int i=0;i<26;i++)
        for(int j=0;j<symbols[i];j++)
          list.add(Character.toString(i+'a'));
      return list;
  }

  public static void main(String[] args) {
    String[] st = new String[]{"bella","label","roller"};
    commonChars(st);
  }
}
