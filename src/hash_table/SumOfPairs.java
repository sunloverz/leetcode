package hash_table;

import java.util.ArrayList;

public class SumOfPairs {
  public static  void getPairs(int[] arr, int sum) {
    int length = arr.length;
    boolean[] seen = new boolean[length];
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    ArrayList<Integer> temp;

    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++) {
        if(arr[i]+arr[j] == sum && !seen[j] && !seen[i]){
          temp = new ArrayList<>();
          temp.add(arr[i]);
          temp.add(arr[j]);
          list.add(temp);
          seen[j] = true;
          seen[i] = true;
        }
      }
    }

    System.out.println(list.toString());
  }

  public static void main(String[] args) {
    int[] arr = {5, 5, 5, 0, 0, 0, 5};
    getPairs(arr, 5);

    int[] arr2 = {3, 3, 6, 0};
    getPairs(arr2, 6);
  }
}
