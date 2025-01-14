package problems;

public class BestTimeToBuyAndSellStock2 {

    private int[] prices;

    public BestTimeToBuyAndSellStock2(int[] prices) {
        this.prices = prices;
    }

    public int solve() {
        int maxProfit = 0;

        for(int i = 1; i < this.prices.length; i++) {
            if(this.prices[i] > this.prices[i - 1]) {
                maxProfit += this.prices[i] - this.prices[i - 1];
            }
        }

        return maxProfit;
    }
}
