package sort;

import java.util.HashMap;

public class ShuffleString {
  public String restoreString(String s, int[] indices) {
    HashMap<Integer, Character> map = new HashMap<>();
    for(int i=0;i<indices.length;i++) {
      map.put(indices[i], s.charAt(i));
    }
    StringBuilder str = new StringBuilder();
    for(int i=0;i<indices.length;i++) {
      str.append(map.get(i));
    }
    return str.toString();
  }
}
