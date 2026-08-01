class Solution {
      
    public boolean isPalindrome(String s) {
       int l=s.length()-1;
       String st="";
       for(int i=l;i>=0;i--){
        if((s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>=48 && s.charAt(i)<=57)){
            
            st+=Character.toLowerCase(s.charAt(i));
        }
       }
       
        String rev="";
        for(int i=0;i<=l;i++){
        if((s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>=48 && s.charAt(i)<=57)){
            
            rev+=Character.toLowerCase(s.charAt(i));
        }
       }
       if(rev.equals(st)){
        return true;
       }
       return false;
    }
}