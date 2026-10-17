class Solution {
    public int maxProfit(int[] prices) {
        int sell =1;
    
        int profit = 0;
    
        int totalProfit = 0;
        while(sell<prices.length){
            if(prices[sell]>prices[sell-1]){
            totalProfit += prices[sell]-prices[sell-1];
            }
            sell++;
        

       
 
        
    }
     return totalProfit;
}
}