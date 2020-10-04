package hash_table;

public class LongestPalindrome {
  public int longestPalindrome(String s) {
    int[] arr = new int[100];
    s = s.toLowerCase();
    for(char ch:s.toCharArray()) arr[ch-'a']++;
    int count = 0;
    int max = Integer.MIN_VALUE;
    for(int i=0;i<100;i++) {
      if(arr[i]%2==0) {
        count += arr[i];
      } else {
        max = Integer.max(max, arr[i]);
      }
    }
    return count + (max == Integer.MIN_VALUE? 0: max);
  }
}
