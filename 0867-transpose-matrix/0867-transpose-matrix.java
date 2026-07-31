class Solution {
    public int[][] transpose(int[][] m) {
        int[][] tm=new int[m[0].length][m.length];
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                l.add(m[i][j]);
            }
        }
        int ind=0;
        for(int j=0;j<tm[0].length;j++){
            for(int i=0;i<tm.length;i++){
                tm[i][j]=l.get(ind++);
            }
        }
        return tm;
    }
}