package string;

public class CustomSortString {
  public String customSortString(String S, String T) {
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<S.length();i++) {
      for(int j=0;j<T.length();j++) {
        if(T.charAt(j) == S.charAt(i)) {
          sb.append(T.charAt(j));
        }
      }
    }
    for(int i=0;i<T.length();i++) {
      if(S.indexOf(T.charAt(i))==-1) {
        sb.append(T.charAt(i));
      }
    }
    return sb.toString();
  }
}
