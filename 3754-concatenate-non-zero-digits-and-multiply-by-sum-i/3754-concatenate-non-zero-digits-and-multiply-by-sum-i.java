class Solution {
    public long sumAndMultiply(int n) {
        long res=0;
        int sum=0;
        int nn=0;
        while(n>0){
            int r=n%10;
            if(r!=0){
                sum+=r;
                nn=nn*10+r;
            }
            n/=10;
        }
        while(nn>0){
            int r=nn%10;
            n=n*10+r;
            nn/=10;
        }
        res=(long)n*sum;
        return res;
    }
}