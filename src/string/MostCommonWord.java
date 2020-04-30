package string;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MostCommonWord {
  public static String mostCommonWord(String paragraph, String[] banned) {
    HashMap<String, Integer> map = new HashMap<>();
    String[] arr = paragraph.split("\\W");
    List<String> list = Arrays.asList(banned);

    String ans = "";
    int max = Integer.MIN_VALUE;
    for(String str:arr) {
      str = str.toLowerCase();
      if(!str.isBlank() && !list.contains(str)){
        int val = map.getOrDefault(str, 0)+1;
        map.put(str, val);
        if(val > max) {
          max = val;
          ans = str;
        }
      }
    }

    return ans;
  }
}
