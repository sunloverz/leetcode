package string;

import java.util.ArrayList;

public class ReverseOnlyLetters {
  public String reverseOnlyLetters(String S) {
    char[] arr = S.toCharArray();
    int l=0, r=S.length()-1;
    while(l<r) {
      while(!Character.isLetter(arr[l]) && l<r) l++;
      while(!Character.isLetter(arr[r]) && l<r) r--;
      char temp = arr[l];
      arr[l] = arr[r];
      arr[r] = temp;
      l++;
      r--;
    }
    
    return String.valueOf(arr);
  }
}
