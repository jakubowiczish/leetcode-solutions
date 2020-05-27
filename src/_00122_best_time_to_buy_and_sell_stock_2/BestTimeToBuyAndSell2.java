package _00122_best_time_to_buy_and_sell_stock_2;

public class BestTimeToBuyAndSell2 {

    public int maxProfit(int[] prices) {
         int profit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1])
                profit += prices[i + 1] - prices[i];
        }

        return profit;
    }
}
