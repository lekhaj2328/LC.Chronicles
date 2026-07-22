class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        while(n>0){
            if(n>=i){
                n-=i;
            }else{
                return i-1;
            }
            i++;
        }
        return i-1;
    }
}