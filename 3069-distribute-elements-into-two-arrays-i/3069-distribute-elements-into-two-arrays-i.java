class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> a1=new ArrayList<>();
        List<Integer> a2=new ArrayList<>();
        a1.add(nums[0]);
        a2.add(nums[1]);
        int l1=nums[0];
        int l2=nums[1];
        for(int i=2;i<nums.length;i++){
            if(l1>l2){
                l1=nums[i];
                a1.add(l1);
            }else{
                l2=nums[i];
                a2.add(l2);
            }
        }
        int[] r=new int[nums.length];
        int ind=0;
        for(int i:a1){
            r[ind++]=i;
        }
        for(int i:a2){
            r[ind++]=i;
        }
return r;
    }
}