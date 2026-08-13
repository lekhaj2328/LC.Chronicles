class Solution {
      
    public boolean isPalindrome(String s) {
       s=s.toLowerCase();
       int l=0;
       int r=s.length()-1;
       while(l<r){
        char cl=s.charAt(l);
        char cr=s.charAt(r);
        if(!(cl>='a'&&cl<='z') && !(cl>='0'&&cl<='9')){
            l++;
            continue;
        }
        if(!(cr>='a'&&cr<='z')&&!(cr>='0'&&cr<='9')){
           r--;
           continue;
        }
        if(cl==cr){
            l++;
            r--;
            continue;
        }else{
            return false;
        }
       }
       return true;
    }
}