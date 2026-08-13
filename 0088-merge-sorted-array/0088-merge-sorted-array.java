class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        Map<Integer,Integer> s=new TreeMap<>();
        for(int a:nums2){
            s.put(a,s.getOrDefault(a,0)+1);
        }
        for(int i=0;i<m;i++){
            s.put(nums1[i],s.getOrDefault(nums1[i],0)+1);
        }
        int ind=0;
        for(int a:s.keySet()){
            for(int i=0;i<s.get(a);i++){
                nums1[ind++]=a;
            }
        }
       
        
    }
}