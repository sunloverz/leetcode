package string;

public class NumberOfSegments {
  public static  int countSegments(String s) {
    if(s.isEmpty()||s.isBlank()) return 0;
    String[] arr = s.trim().split("\\s+");
    return arr.length;
  }

  public static void main(String[] args) {
    System.out.println(countSegments("    foo    bar"));
  }
}
