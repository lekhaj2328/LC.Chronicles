class Solution {
    public int missingInteger(int[] nums) {
        int t=nums[0];
        int ps=0;
        for(int i=0;i<nums.length;i++){
            if(t==nums[i]){
                ps+=nums[i];
                t++;
            }else{
                break;
            }
        }
        Arrays.sort(nums);
        for(int n:nums){
            if(n<ps){
                continue;
            }else if(n==ps){
                ps++;
            }
        }
        return ps;
    }
}