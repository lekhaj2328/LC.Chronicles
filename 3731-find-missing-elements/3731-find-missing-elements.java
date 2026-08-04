class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> l=new ArrayList<>();
        int n=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==n){
                n++;
            }else{
                while(n<=nums[i]){
                    if(n!=nums[i]){
                        l.add(n);
                    }
                    
                    n++;
                }
                
            }
        }
        return l;
    }
}