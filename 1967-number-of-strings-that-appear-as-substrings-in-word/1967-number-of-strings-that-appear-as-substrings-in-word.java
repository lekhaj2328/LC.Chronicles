class Solution {
    public int numOfStrings(String[] patterns, String word) {
        
        int c=patterns.length;
        for(String s:patterns){
           if(!word.contains(s)){
                    c--;
                }
        }
        return c;
    }
}