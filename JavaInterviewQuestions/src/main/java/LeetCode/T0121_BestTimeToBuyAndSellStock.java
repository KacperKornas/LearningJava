package LeetCode;

public class T0121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {

        int bestDay = 0;
        for(int i = 0; i < prices.length; i++) {
            for(int j = i + 1; j < prices.length; j++) {
                if(prices[j] - prices[i] > bestDay) bestDay = prices[j] - prices[i];
            }
        }
        return bestDay;
    }
}
