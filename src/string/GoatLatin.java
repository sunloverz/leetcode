package string;

public class GoatLatin {
  public String toGoatLatin(String S) {
    String[] arr = S.split(" ");
    String[] ans = new String[arr.length];
    String vowels = "aeiou";
    String a = "a";
    int i=0;
    for(String str:arr){
      if(vowels.indexOf(Character.toLowerCase(str.charAt(0)))==-1)
        ans[i] = str.substring(1) + str.charAt(0);
      else
        ans[i] = str;
      ans[i] = ans[i] + "ma" + a;
      a = a.concat("a");
      i++;
    }

    return String.join(" ", ans);
  }
}
