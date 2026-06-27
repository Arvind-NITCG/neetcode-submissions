class Solution {
    public int maxProfit(int[] prices) {
        int min = 101;
        int max = 0;
        for(int price:prices){
         if(price < min){
            min = price;
         }
         else if(price - min > max){
            max = price - min;
         }
        }
     return max;
    }
}
