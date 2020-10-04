package string;

public class RepeatedString {
  static long repeatedString(String s, long n) {
    int len  = s.length();
    long total = n / len;
    long remainder = n % len;
    long count = 0;

    for(char ch:s.toCharArray()){
      if(ch=='a')
        count++;
    }
    count = count * total;
    for(int i=0;i<remainder;i++){
      if(s.charAt(i) == 'a')
        count++;
    }
    return count;
  }
}

