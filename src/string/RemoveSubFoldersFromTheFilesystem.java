package string;

import java.util.*;

public class RemoveSubFoldersFromTheFilesystem {
  public List<String> removeSubfolders(String[] folder) {
    List<String> list = new ArrayList<>();
    Arrays.sort(folder);
    for(int i=0;i<folder.length;i++){
      String subfolder = folder[i];
      list.add(subfolder);
      while(i<folder.length-1 && folder[i+1].startsWith(subfolder+'/')) i++;
    }
    return list;
  }
}
