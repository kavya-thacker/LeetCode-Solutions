class Solution {
    public int maxProfit(int[] prices) {
    int maxp=0;
    int bestbuy= prices[0];
    for(int i=0; i<prices.length; i++){
        bestbuy = Math.min(bestbuy,prices[i]);
        maxp = Math.max(maxp,prices[i]-bestbuy);
    }
    return maxp;
    }
}