class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, r = 0;
        int Count = 0;
        int m = 0;

        while (r < nums.length) {
            if (nums[r] == 0) {
                Count++;
            }
            while (Count > k) {
                if (nums[l] == 0) {
                    Count--;
                }
                l++;
            }
            m = Math.max(m, r - l + 1);
            r++;
        }

        return m;
    }
}
