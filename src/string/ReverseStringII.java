package string;

public class ReverseStringII {
  public String reverseStr(String s, int k) {
    StringBuilder sb = new StringBuilder();
    boolean flag = true;
    StringBuilder tmp = new StringBuilder();
    for(int i=0;i<s.length();i++) {
      tmp.append(s.charAt(i));
      if((i+1) % k == 0) {
        if(flag) {
          sb.append(tmp.reverse());
          flag = false;
        } else {
          sb.append(tmp);
          flag = true;
        }
        tmp = new StringBuilder();
      }
    }

    if(s.length() % k != 0) {
      if(flag)
        sb.append(tmp.reverse());
      else
        sb.append(tmp);
    }
    return sb.toString();
  }
}
