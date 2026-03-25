class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        int buy_price=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            int sell_price=prices[i];
            if(sell_price>buy_price){
                int profit=sell_price-buy_price;
                max_profit=Math.max(profit,max_profit);
            }            
            else{
                buy_price=sell_price;
            }
        }
        return max_profit;
    }
}