package hash_table;

public class LongestPalindrome {
  public int longestPalindrome(String s) {
    int[] arr = new int[128];
    for(char ch:s.toCharArray()) arr[ch]++;
    int count = 0;
    for(int i=0; i<128; i++)
      count += (arr[i] /2) * 2;
    return (count == s.length()? count: count+1);
  }
}
