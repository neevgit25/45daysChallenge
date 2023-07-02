public class buysellstock {
  
    public int maxProfit(int[] prices) {
       int n=prices.length;
       int buyPrice=Integer.MAX_VALUE;
       int maxprofit= 0;
       for(int i=0;i<n;i++){
           if(buyPrice<prices[i])
           {
               int profit=prices[i]-buyPrice;
               maxprofit=Math.max(profit, maxprofit);
           }
           else
           {
               buyPrice=prices[i];
           }
       }
       return maxprofit;
    }
}
