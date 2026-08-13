class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] res=new int[code.length];
        if(k<0){
            for(int i=code.length-1;i>=0;i--){
                int s=0;
                int wi=(i-1+code.length)%code.length;
                for(int j=0;j<Math.abs(k);j++){
                    s+=code[wi];
                    wi=(wi-1+code.length)%code.length;
                }res[i]=s;
            }
        } 
        
        if(k>0){
            for(int i=0;i<code.length;i++){
                int s=0;
                int wi=0;
                if(wi<code.length){
                    wi=(i+1)%code.length;
                }
                for(int j=0;j<k;j++){
                    s+=code[wi++];
                    if(wi==code.length){wi=0;}
                }
                res[i]=s;
            }
        }
        return res;
    }
}