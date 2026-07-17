class Solution {
    public int cd(int n){
        int c=0;
        while(n>0){
            c++;
            n/=10;
        }
        return c;
    }
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int n=cd(nums[i]);
            if(n%2==0){
                c++;
            }
        }
        return c;
    }
}