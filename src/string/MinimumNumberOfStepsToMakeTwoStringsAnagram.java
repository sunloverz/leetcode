package string;

public class MinimumNumberOfStepsToMakeTwoStringsAnagram {
  public int minSteps(String s, String t) {
    int[] sArr = new int[26];
    int[] tArr = new int[26];
    int count = 0;
    for(int i=0;i<s.length();i++) {
      sArr[s.charAt(i)-'a']++;
      tArr[t.charAt(i) -'a']++;
    }
    for(int i=0;i<26;i++)
      if(tArr[i] > sArr[i])
        count += tArr[i] - sArr[i];
    return count;
  }
}
