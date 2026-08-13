class Solution {
    public int[][] transpose(int[][] m) {
        int[][] tm=new int[m[0].length][m.length];
        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                tm[j][i]=m[i][j];
            }
        }
        
        return tm;
    }
}