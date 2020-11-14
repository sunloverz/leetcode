package array;

import java.util.ArrayList;

public class MergeSortedArray {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    ArrayList<Integer> list = new ArrayList<>();
    int i=0, j=0;
    while (i<m && j < n){
      if(nums1[i] < nums2[j]) {
        list.add(nums1[i++]);
      } else if (nums1[i]>nums2[j]) {
        list.add(nums2[j++]);
      } else {
        list.add(nums1[i++]);
        list.add(nums2[j++]);
      }
    }
    while (j<n) list.add(nums2[j++]);
    while (i<m) list.add(nums1[i++]);
    for(int k=0;k<list.size();k++) nums1[k] = list.get(k);
  }
}

