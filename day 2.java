// Majority element 169 leetcode question

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int j = 0;
        for(int num: nums){
            if(count == 0){
                j = num;
            }
            if(j == num){
                count++;
            }else{ count--;
            }
        }
        return j;
    }
}