class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        int p=0;
        if(nums[0]<0 && nums[1]<0){
            p=nums[0]*nums[1]*nums[l-1];
        }
        int p1=nums[l-3]*nums[l-2]*nums[l-1];
        return Math.max(p,p1);
    }
}