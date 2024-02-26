class Solution {
    public int maxProfit(int[] prices) {
        int maxVal = 0, minVal = Integer.MIN_VALUE;
                
        for (int price : prices) {
            maxVal = Math.max(maxVal, minVal + price);
            minVal = Math.max(minVal, -price);
        }
            
        return maxVal;
    }
}
