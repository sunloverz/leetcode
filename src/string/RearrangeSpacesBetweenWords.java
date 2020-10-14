package string;

public class RearrangeSpacesBetweenWords {
  public String reorderSpaces(String text) {
    int spaceCount = 0;
    String[] arr = text.trim().split("\\s+");
    for(int i=0;i<text.length();i++)
      if(text.charAt(i) == ' ') spaceCount++;
    if(arr.length==1)
      return  arr[0] + " ".repeat(spaceCount);
    int wordsCount = arr.length;
    int spacesBetweenWords =  spaceCount/(wordsCount -1);
    String result = String.join(" ".repeat(spacesBetweenWords), arr);
    int restCount = spaceCount%(wordsCount-1);
    return  result +" ".repeat(restCount);
  }
}
