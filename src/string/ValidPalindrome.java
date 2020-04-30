package string;

public class ValidPalindrome {
  public static boolean isPalindrome(String s) {
    if(s.isBlank() || s.isEmpty()) return true;
    s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
    int len = s.length()/2;
    int fullLen=s.length();
    for(int i=0;i<len;i++)
      if(s.charAt(i)!=s.charAt(fullLen-i-1)) return false;
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome("0P"));
  }
}
