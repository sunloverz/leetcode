package hash_table;

import java.util.*;

public class SubdomainVisitCount {
  public static List<String> subdomainVisits(String[] cpdomains) {
    List<String> list = new ArrayList<>();
    HashMap<String, Integer> hash = new HashMap<>();
    for(String str:cpdomains) {
      String[] cp = str.split(" ");
      String[] domains = cp[1].split("[.]");
      int len = domains.length;
      List<String> domainList = new ArrayList<>();
      for(int i=len-1;i>=0;i--) {
        domainList.add(0, domains[i]);
        String domain = String.join(".", domainList);
        int count = Integer.parseInt(cp[0]);
        hash.put(domain, hash.getOrDefault(domain, 0) + count);
      }
    }
    hash.forEach((k,v) -> {
      list.add(v+ " "+k);
    });
    return list;
  }

  public static void main(String[] args) {
//    subdomainVisits(new String[]{"9001 discuss.leetcode.com"});
    subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"});
  }
}
