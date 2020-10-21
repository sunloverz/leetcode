package string;

import java.util.*;

public class FindDuplicateFileInSystem {
  public List<List<String>> findDuplicate(String[] paths) {
    List<List<String>> list = new ArrayList<>();
    HashMap<String, List<String>> map = new HashMap<>();
    for (String path : paths) {
      String[] files = path.split(" ");
      for (int j = 1; j < files.length; j++) {
        String[] file = files[j].split("\\(");
        String content = file[1].substring(0, file[1].length() - 1);
        String fullPath = files[0] + '/' + file[0];
        List<String> tmp = map.getOrDefault(content, new ArrayList<>());
        tmp.add(fullPath);
        map.put(content, tmp);
      }
    }
    for(String content:map.keySet()) {
      List<String> tmp = map.get(content);
      if(tmp.size()>1) {
        list.add(tmp);
      }
    }
    return list;
  }
}
