package string;

public class ReplaceAll {
  public String modifyString(String s) {
    String str = "abcdefghijklmnopqrstuvwxyz";
    if(s.length() == 1 && s.charAt(0) == '?')
      return "a";
    if(s.length() == 1) return s;
    StringBuilder sb = new StringBuilder(s);
    int j=0;
    int len = s.length()-1;
    while(s.charAt(0) == str.charAt(j)){
      j++;
    }
    if(s.charAt(0) == '?') sb.setCharAt(0, str.charAt(j++));
    for(int i=1;i<len;i++) {
      if(s.charAt(i) =='?') {
        while(s.charAt(i+1) == str.charAt(j) || s.charAt(i-1) == str.charAt(j)){
          j++;
          if(j>25) j =0;
        }
        sb.setCharAt(i, str.charAt(j++));
      }
      if(j>25) j = 0;
    }
    while(s.charAt(len - 1) == str.charAt(j)){
      j++;
      if(j>25) j =0;
    }
    if(s.charAt(len) == '?') sb.setCharAt(len, str.charAt(j));
    return sb.toString();
  }
}
