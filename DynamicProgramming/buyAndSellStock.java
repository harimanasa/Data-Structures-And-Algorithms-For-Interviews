class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price:prices){
            if(price<minSoFar) minSoFar = price;
            else if (maxProfit<(price-minSoFar)){
                maxProfit = price-minSoFar;
            }
        }
        return maxProfit;
    }
}

// Time complexity: O(n)O(n)O(n). Only a single pass is needed.
//
//Space complexity: O(1)O(1)O(1). Only two variables are used.

/*The points of interest are the peaks and valleys in the given graph.
We need to find the largest price following each valley, which difference could be the max profit.
We can maintain two variables - minprice and maxprofit corresponding to the smallest valley and
maximum profit (maximum difference between selling price and minprice) obtained so far respectively.*/