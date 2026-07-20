class Solution {
    public List<List<Integer>> shiftGrid(int[][] g, int k) {
        int m=g.length;
        int n=g[0].length;
        List<Integer> l=new ArrayList<>();
        k%=(m*n);
        k=(m*n)-k;
        int[] a=new int[k];
        int ind=0;
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                if(ind<=k-1){
                    a[ind++]=g[j][i];
                }else{
                    l.add(g[j][i]);
                }
            }
        }
        ind=0;
        int l_ind=0;
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                if(l_ind<l.size()){
                    g[j][i]=l.get(l_ind++);
                }else{
                    g[j][i]=a[ind++];
                }
            }
        }
        
        List<List<Integer>> r=new ArrayList<>();
        for(int i=0;i<m;i++){
            l=new ArrayList<>();
            for(int j=0;j<n;j++){
                l.add(g[i][j]);
            }
            r.add(l);
        }
        return r;
    }
}