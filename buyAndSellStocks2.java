// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach in three sentences only
/*
 * Here, start from 0th position to length-1 and whenever price at ith position is greaterthan or equal to i+1th position just continue else
 * take prices at i+1th position -price at ith position to maxprofit. Finally, return maxprofit.
 */
class Solution {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        int maxProfit = 0;
        for(int i = 0; i < length-1; i++){
            if(prices[i] >= prices[i+1]) continue;
            maxProfit += prices[i+1] - prices[i];
        }
        return maxProfit;
    }
}