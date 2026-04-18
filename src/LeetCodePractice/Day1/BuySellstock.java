package LeetCodePractice.Day1;

public class BuySellstock {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - min;
            if (profit > ans) {
                    ans = profit;
                }
                min = Math.min(prices[i], min);
            }
            return ans;
        }


    public static void main(String[] args) {
        BuySellstock b = new BuySellstock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(b.maxProfit(prices));
    }
}