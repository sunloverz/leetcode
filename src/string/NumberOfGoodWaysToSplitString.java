package string;

import java.util.HashSet;

public class NumberOfGoodWaysToSplitString {
  public int numSplits(String s) {
    HashSet<Character> pSet = new HashSet<>();
    HashSet<Character> qSet = new HashSet<>();
    int count =0;
    int len = s.length();
    for(int i=0;i<s.length();i++)
      qSet.add(s.charAt(i));
    for(int i=0;i<s.length();i++) {
      pSet.add(s.charAt(i));
      String str = s.substring(i+1, len);
      if(str.indexOf(s.charAt(i)) == -1)
        qSet.remove(s.charAt(i));
      if(pSet.size()==qSet.size()) count++;
    }
    return count;
  }
}


// "aacaba"
