class Solution {
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        int l=nums.length;
        int max=0;
        for(int i=0;i<l;i++){
            max=Math.max(max,nums[i]);
            nums[i]=gcd(nums[i],max);
        }
        Arrays.sort(nums);
        int s=0;
        int e=l-1;
        long sum=0;
        while(s<e){
            sum+=gcd(nums[s],nums[e]);
            s++;
            e--;
        }
        return sum;
    }
}