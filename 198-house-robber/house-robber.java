class Solution {
    public int rob(int[] nums) {
        int rob = 0;
        int skip = 0;
        for (int i = 0; i < nums.length; i ++) {
            int newRob = skip + nums[i];
            int newskip = Math.max(skip, rob);
            rob = newRob;
            skip = newskip;
        }
        return Math.max(rob, skip);
    }
}