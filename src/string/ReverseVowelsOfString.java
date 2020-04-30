package string;

public class ReverseVowelsOfString {
//  "leetcode"
public static String reverseVowels(String s) {
  StringBuilder st = new StringBuilder(s);
  String vowels = "aeiouAEIOU";
  int l=0, r=s.length()-1;
  while(l<r) {
    while(l<s.length() && !vowels.contains(Character.toString(s.charAt(l)))) l++;
    while(r>0 && !vowels.contains(Character.toString(s.charAt(r)))) r--;
    if(l>=r) break;
    char temp = st.charAt(l);
    st.setCharAt(l, st.charAt(r));
    st.setCharAt(r, temp);
    l++;
    r--;
  }
  return st.toString();
}
}
