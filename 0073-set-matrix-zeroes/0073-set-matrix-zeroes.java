class Solution {
    
    public void setZeroes(int[][] matrix) {
        int[] I=new int[matrix.length];
        int[] J=new int[matrix[0].length];
        int k=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    I[i]=1;
                    J[j]=1;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(1==I[i]||1==J[j]){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}