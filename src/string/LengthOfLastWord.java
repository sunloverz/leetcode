package string;

public class LengthOfLastWord {
  public int lengthOfLastWord(String s) {
    if(s.isEmpty()|| s.isBlank()) return 0;
    String[] arr = s.trim().split("\\s+");
    return arr[arr.length-1].length();
  }

  public static int[] selectionSortArray(int[] arr){
    int min = Integer.MAX_VALUE;
    int index = 0;
    for(int i=0;i<arr.length-1;i++) {
       min = arr[i];
       int val = arr[i];
       for(int j=i+1;j<arr.length;j++) {
         if(arr[j]<min) {
           min = arr[j];
           index = j;
         }
       }
       arr[i] = arr[index];
       arr[index] = val;
    }
    return arr;
  }
}
