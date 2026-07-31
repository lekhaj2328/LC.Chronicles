class Solution {
    public boolean checkOnesSegment(String s) {
        char[] c=s.toCharArray();
        if("1".equals(s)){
            return true;
        }
        for(int i=1;i<s.length();i++){
            if(c[i]=='1' && c[i-1]=='0'){
                return false;
            }
        }
       return true;
    }
}