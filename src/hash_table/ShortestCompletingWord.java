package hash_table;

public class ShortestCompletingWord {
  public String shortestCompletingWord(String licensePlate, String[] words) {
    int[] licenseArr = new int[26];
    licensePlate = licensePlate.toLowerCase();
    for(int i =0;i<licensePlate.length();i++){
      char ch = licensePlate.charAt(i);
      if(Character.isLetter(ch))
        licenseArr[ch-'a']++;
    }
    int min = Integer.MAX_VALUE;
    String result = null;
    for (String word : words) {
      if(matches(word, licenseArr) && word.length() < min) {
        min = word.length();
        result = word;
      }
    }
    return result;
  }

  public boolean matches(String word, int[] licenseArr) {
    int[] wordArr = new int[26];
    for(int i=0;i<word.length();i++)
      wordArr[word.charAt(i)-'a']++;
    for(int i=0;i<26;i++)
      if(licenseArr[i] > wordArr[i])
        return false;
    return true;
  }
}
