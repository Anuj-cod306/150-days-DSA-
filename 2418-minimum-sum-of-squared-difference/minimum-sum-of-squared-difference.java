class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int[] diff = new int [n];
        int maxdiff = 0;
        for(int i = 0; i< n; i++){
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            maxdiff = Math.max(maxdiff, diff[i]);
        }
        int[] countdiff = new int [maxdiff + 1];
        for(int d : diff){
            countdiff[d]++;
        }
        long k = (long) k1 + k2;
        for(int currdiff = maxdiff ; currdiff > 0 && k > 0 ; currdiff--){
            int countops = (int) Math.min(countdiff[currdiff], k);
               countdiff[currdiff]     -= countops;
    countdiff[currdiff - 1] += countops;
    k  -= countops;
        }
        long result = 0;
        for (long d = 1; d <= maxdiff; d++) {
    result += countdiff[(int) d] * d * d;
}

return result;
    }
}