class Solution {
    public int[] replaceElements(int[] a) {
    for(int i=0;i<a.length;i++){
       int max=-1;

       for(int j=i+1;j<a.length;j++){
          max=Math.max(max,a[j]);
        }
       a[i]=max;
    }
    return a;
    }


    }
