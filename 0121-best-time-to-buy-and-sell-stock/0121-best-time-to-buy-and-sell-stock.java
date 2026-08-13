class Solution {
    public int maxProfit(int[] prices) {
        int m=0;
       int cp=prices[0];
       for(int i=1;i<prices.length;i++){
        if(prices[i]>=cp){
            m=Math.max(m,prices[i]-cp);
        }else{
            cp=prices[i];
        }
       }
       return m;
    }
}