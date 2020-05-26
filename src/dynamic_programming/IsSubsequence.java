package dynamic_programming;

public class IsSubsequence {
  public boolean isSubsequence(String s, String t) {
    if(s.length()==0) return true;
    if(s.length()>t.length()) return false;
    int j = 0;
    for(int i=0;i<t.length();i++){
      if(j>=s.length()) return true;
      if(t.charAt(i) == s.charAt(j)) {
        j++;
      }
    }
    return s.length() == j;
  }
}

