class Solution {
    public void rotate(int[][] matrix) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                l.add(matrix[i][j]);
            }
        }
        int ind=0;
        for(int j=matrix.length-1;j>=0;j--){
            for(int i=0;i<matrix.length;i++){
                matrix[i][j]=l.get(ind);
                ind++;
            }
        }
    }
}