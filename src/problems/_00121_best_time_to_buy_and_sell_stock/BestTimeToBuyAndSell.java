package _00121_best_time_to_buy_and_sell_stock;

public class BestTimeToBuyAndSell {

    public int maxProfit(int[] prices) {
        int max = 0, min = Integer.MAX_VALUE;

        for (int price : prices) {
            min = Math.min(min, price);
            max = Math.max(price - min, max);
        }

        return max;
    }

}
