class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new TreeSet<>();
        for(int n:nums){
            s.add(n);
        }
        if(s.isEmpty()){
           return 0; 
        }
        int i=s.iterator().next();
        int r=0;
        int lr=0;
        for(int n:s){
            if(i==n){
                r++;
                i++;
            }else{
                lr=Math.max(r,lr);
                i=n+1;
                r=1;
            }
        }
        return Math.max(r,lr);
    }
}