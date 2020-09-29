package hash_table;

public class MaximumNumberOfBalloons {
  public int maxNumberOfBalloons(String text) {
    String balloon = "balloon";
    int[] arr = new int[26];
    int[] textArr = new int[26];
    for(char ch:balloon.toCharArray()) arr[ch-'a']++;
    for(char ch:text.toCharArray()) textArr[ch-'a']++;

    int min = Integer.MAX_VALUE;
    for(int i=0;i<26;i++) {
      if(arr[i] >0) {
        min = Math.min(min, textArr[i]/arr[i]);
      }
    }
    return min;
  }
}
