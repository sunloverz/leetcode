package string;

public class FindKthBitInNthBinaryString {
  public char findKthBit(int n, int k) {
    String str = "0";
    for(int i=0;i<n;i++) {
      str = str + '1' + reverse(invert(str));
    }
    return str.charAt(k-1);
  }

  public String reverse(String s) {
    StringBuilder sb = new StringBuilder();
    for(int i=s.length()-1;i>=0;i--) {
      sb.append(s.charAt(i));
    }
    return sb.toString();
  }

  public String invert(String s) {
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<s.length();i++) {
      char ch = s.charAt(i) == '1'? '0':'1';
      sb.append(ch);
    }
    return sb.toString();
  }
}
