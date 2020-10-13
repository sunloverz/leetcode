package string;

public class GreatestCommonDivisorOfStrings {
  public String gcdOfStrings(String str1, String str2) {
    int len1 = str1.length();
    int len2 = str2.length();
    StringBuilder sb = new StringBuilder();
    String res = "";
    for(int i=0; i<len1 && i<len2; i++) {
      sb.append(str1.charAt(i));
      String prefix = sb.toString();
      if(str2.contains(prefix)) {
        if(isGCD(str1, prefix) && isGCD(str2, prefix)) {
          res = prefix;
        }
      }
    }
    return res;
  }

  private boolean isGCD(String str, String prefix) {
    int len = str.length()/prefix.length();
    return str.equals(prefix.repeat(len));
  }
}
