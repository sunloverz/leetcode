package array;

public class ThirdMaximumNumber {
  public int thirdMax(int[] nums) {
    Integer maxFirst = null;
    Integer maxSecond = null;
    Integer maxThird = null;
    for(Integer num:nums) {
      if(num.equals(maxFirst) || num.equals(maxSecond) || num.equals(maxThird)) continue;
      if(maxFirst == null || num > maxFirst) {
        maxThird = maxSecond;
        maxSecond = maxFirst;
        maxFirst = num;
      } else if(maxSecond == null || num > maxSecond) {
        maxThird = maxSecond;
        maxSecond = num;
      } else if( maxThird == null || num > maxThird) {
        maxThird = num;
      }

    }
    return maxThird == null ? maxFirst: maxThird;
  }
}

