package hash_table;

public class VerifyingAnAlienDictionary {
  int[] arr = new int[26];
  public boolean isAlienSorted(String[] words, String order) {
    int len = order.length();
    for(int i=0;i<len;i++)
      arr[order.charAt(i)-'a']= i;
    for(int i=0;i<words.length-1;i++)
      if(compare(words[i], words[i+1]))
        return false;
    return true;
  }

  public boolean compare(String word1, String word2) {
    int n = word1.length();
    int m = word2.length();
    for(int i=0;i<n && i<m;i++)
      if(word1.charAt(i)!=word2.charAt(i))
        return arr[word1.charAt(i)-'a'] > arr[word2.charAt(i)- 'a'];
    return n > m;
  }
}
