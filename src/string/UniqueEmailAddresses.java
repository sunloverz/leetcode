package string;

import java.util.HashSet;

public class UniqueEmailAddresses {
  public int numUniqueEmails(String[] emails) {
    HashSet<String> set = new HashSet<>();
    for(String email:emails) {
      String[] tmp = email.split("@");
      String localName = tmp[0].replaceAll("\\.","");
      localName = localName.split("\\+")[0];
      set.add(localName+"@"+tmp[1]);
    }
    return set.size();
  }
}
