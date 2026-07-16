class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            int a=Math.min(height[l],height[r]);
            int b=Math.abs(l-r);
            area=Math.max(a*b,area);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return area;
    }
}