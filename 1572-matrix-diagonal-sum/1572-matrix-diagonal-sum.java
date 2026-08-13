class Solution {
    public int diagonalSum(int[][] mat) {
        int s=0;
        int j=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
            s+=mat[i][j]+mat[i][(n-1)-j];
            j++;  
        }
        if(n%2!=0){
                s-=mat[n/2][n/2];
            }
        return s;
    }
}