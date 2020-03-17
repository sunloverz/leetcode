package string;

public class ReverseWordsInString3 {
  public static String reverseWords(String s) {
    String[] str = s.split("\\s+");
    String[] str2 = new String[str.length];
    int i=0;
    for(String val:str)
      str2[i++] = new StringBuilder(val).reverse().toString();
    return String.join(", ", str2);
  }
}
