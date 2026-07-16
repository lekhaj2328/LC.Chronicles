class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int m=0;
        StringBuilder ns=new StringBuilder("");
        for(char c:s.toCharArray()){
            int ind=ns.indexOf(String.valueOf(c));
            if(ind==-1){
                l++;
                ns.append(c);
            }else{
                m=Math.max(l,m);
                l=l-ind-1;
                ns.delete(0,ind+1);
                ns.append(c);
                l++;
            }
        }
        return Math.max(l,m);
    }
}