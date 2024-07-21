class Solution {
    public int maxProfit(int[] prices) {
        
       
        int minPrice = Integer.MAX_VALUE;
        int maxProf =0;

        for(int price : prices)
        {
            if(price<minPrice)
            {
                minPrice = price;
            }
            else
            {
                int prof = price- minPrice;
                maxProf += prof;
                minPrice = price;  // Updating the price in case previously sold
            }
        }
        return maxProf;
    }
}
