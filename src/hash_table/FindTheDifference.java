package hash_table;

public class FindTheDifference {
  public char findTheDifference(String s, String t) {
    int[] sArr = new int[26];
    int[] tArr = new int[26];
    for(char ch:s.toCharArray()) sArr[ch-'a']++;
    for(char ch:t.toCharArray()) tArr[ch-'a']++;

    for(int i=0;i<26;i++) {
      if(tArr[i] > sArr[i]) {
        return (char)(i +'a');
      }
    }

    return Character.MIN_VALUE;
  }
}
