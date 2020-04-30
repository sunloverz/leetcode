package string;

public class ValidPalindromeII {
  public static boolean isPalindromeRange(String s, int i, int j) {
    int l=i, r=j;
    while(l<r) {
      if(s.charAt(l)!=s.charAt(r)) return false;
      l++;
      r--;
    }
    return true;
  }

  public static boolean validPalindrome(String s) {
    int l=0, r= s.length()-1;
    while(l<r) {
      if(s.charAt(l)!=s.charAt(r)) {
        return isPalindromeRange(s, l+1, r) || isPalindromeRange(s, l, r-1);
      }
      l++;
      r--;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(validPalindrome("abdtdgba"));
  }

  public boolean validPalindrome2(String s) {
    StringBuilder st = new StringBuilder(s);

    for(int i=0;i<s.length();i++){
      StringBuilder tmp = new StringBuilder(st);
      if(!isPalindrome(tmp.deleteCharAt(i))) return false;
    }
    return true;
  }

  public boolean isPalindrome(StringBuilder s) {
    return s.toString().equals(s.reverse().toString());
  }
}
