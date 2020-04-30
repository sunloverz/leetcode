package array;

public class FindPivotIndex {
  public int pivotIndex(int[] nums) {
    int rightSum = 0, leftSum=0;
    for(int val:nums) rightSum+=val;
    for(int i=0;i<nums.length;i++){
      rightSum-=nums[i];
      if(rightSum==leftSum) return i;
      leftSum+=nums[i];
    }
    return -1;
  }
}
