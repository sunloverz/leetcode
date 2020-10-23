package string;

import java.util.Arrays;
import java.util.Comparator;

public class RearrangeWordsInASentence {
  public static String arrangeWords(String text) {
    String[] str = text.toLowerCase().split(" ");
    Arrays.sort(str, new StringSorter());
    String result = String.join(" ", str);;
    return  result.substring(0, 1).toUpperCase() + result.substring(1);
  }

  private static class StringSorter implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
      return s1.length() - s2.length();
    }
  }

  public static void main(String[] args) {
    System.out.println(arrangeWords("Keep calm and code on"));
  }
}
