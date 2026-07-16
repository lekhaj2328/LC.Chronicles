class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Set<Integer> s=new TreeSet<>();
        for(int i: arr){
            s.add(i);
        }
        int[] res=new int[arr.length];
        Map<Integer,Integer> m=new HashMap<>();
        int ind=1;
        for(int i:s){
            m.put(i,ind++);
        }ind=0;
        for(int x:arr){
            res[ind++]=m.get(x);
        }
        return res;
    }
}