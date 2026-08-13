class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double max_avg=(double)sum/k;
        if(nums.length<=k){
            return max_avg;
        }
        for(int i=k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            double avg=(double)sum/k;
            max_avg=Math.max(max_avg,avg);
        }
        return max_avg;
    }
}