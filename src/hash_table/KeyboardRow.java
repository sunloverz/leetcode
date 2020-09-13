package hash_table;

import java.util.ArrayList;

public  class KeyboardRow {
  public static String[] findWords(String[] words) {
    ArrayList<String> list = new ArrayList<>();
    int[] first = new int[26];
    int[] second = new int[26];
    int[] third = new int[26];
    for(char ch:"qwertyuiop".toCharArray()) first[ch-'a']++;
    for(char ch:"asdfghjkl".toCharArray()) second[ch-'a']++;
    for(char ch:"zxcvbnm".toCharArray()) third[ch-'a']++;
    for(String word:words) {
      int[] arr = new int[26];
      for(char ch:word.toCharArray())
        arr[Character.toLowerCase(ch)-'a'] = 1;

      boolean firstContains = true;
      for(int i=0;i<26;i++) {
        if(arr[i] > first[i]) {
          firstContains = false;
          break;
        }
      }

      boolean secondContains = true;
      for(int i=0;i<26;i++) {
        if(arr[i] > second[i]) {
          secondContains = false;
          break;
        }
      }

      boolean thirdContains = true;
      for(int i=0;i<26;i++) {
        if(arr[i] > third[i]) {
          thirdContains = false;
          break;
        }
      }

      if(firstContains || secondContains || thirdContains) list.add(word);

    }

    return list.toArray(String[]::new);
  }

  public static void main(String[] args) {
    String[] str =  new String[] {"Hello", "Alaska", "Dad", "Peace"};
    String[] ans = findWords(str);
    System.out.println(ans.toString());
  }

}
