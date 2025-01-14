package problems;

public class BestTimeToBuyAndSellStock {

    private int[] prices;

    public BestTimeToBuyAndSellStock(int[] prices) {
        this.prices = prices;
    }

    public int solve() {
        int maxProfit = 0;
        int buy = this.prices[0];

        for (int price : this.prices) {
            if (price < buy) buy = price;
            maxProfit = Math.max(maxProfit, price - buy);
        }

        return maxProfit;
    }
}
