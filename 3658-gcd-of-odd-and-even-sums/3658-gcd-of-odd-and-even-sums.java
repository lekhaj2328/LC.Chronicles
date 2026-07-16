class Solution {
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public int gcdOfOddEvenSums(int n) {
        int a=2;
        int b=1;
        int es=0;
        int os=0;
        for(int i=1;i<=n;i++){
            es+=a;
            os+=b;
            a+=2;
            b+=2;
        }
        return gcd(os,es);
    }
}