package string;

public class RansomNote {
  public boolean canConstruct(String ransomNote, String magazine) {
    int[] ransomArr = new int[26];
    int[] magazineArr = new int[26];
    for(int i=0;i<ransomNote.length();i++)
      ransomArr[ransomNote.charAt(i)-'a']++;
    for(int i=0;i<magazine.length();i++)
      magazineArr[magazine.charAt(i)-'a']++;
    for(int i=0;i<=26;i++)
      if(ransomArr[i] > magazineArr[i]) return false;
    return true;
  }
}
