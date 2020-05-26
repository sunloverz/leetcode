package dynamic_programming;

public class BestTimeToBuyAndSellStock {
  public int maxProfit(int[] prices) {
    int max = 0;
    for(int i=0;i<prices.length;i++){
      for(int j=i+1;j<prices.length;j++){
        if(prices[j]>=prices[i]) {
          max = Math.max(max, prices[j]-prices[i]);
        }
      }
    }
    return max;
  }

  public int maxProfit2(int[] prices) {
    if(prices.length==0) return 0;
    int max = 0;
    int min = prices[0];
    for(int i=1;i<prices.length;i++){
      max = Math.max(max, prices[i]-min);
      min = Math.min(min, prices[i]);
    }
    return max;
  }
}
