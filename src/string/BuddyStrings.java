package string;

import java.util.ArrayList;
import java.util.HashSet;

public class BuddyStrings {
  public boolean buddyStrings(String A, String B) {
    if(A.length()!=B.length()) return false;
    if(A.equals(B)) {
      HashSet<Character> set = new HashSet<>();
      for(char ch:A.toCharArray()) set.add(ch);
      return set.size() < A.length();
    }
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=0;i<A.length();i++)
      if(A.charAt(i)!=B.charAt(i)) list.add(i);

    return list.size()==2 && A.charAt(list.get(0)) == B.charAt(list.get(1)) && B.charAt(list.get(0)) == A.charAt(list.get(1));
  }
}

