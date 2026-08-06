class Solution {
    static int prod(int n){
        int p=1;
        while(n>0){
            int r=n%10;
            p*=r;
            n/=10;
        }
        return p;
    }
    public int smallestNumber(int n, int t) {
        while(n<=100){
            int p=prod(n);
            if(p%t==0){
                return n;
            }
            n++;
        }
        return n;
    }
}