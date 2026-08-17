class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int n = nums.length;
        int p1 = 0;
        int zeros = 0;
        int maxlen = 0;

        for(int p2 = 0; p2<n; p2++){
            if(nums[p2] == 0){
                zeros++;
            }

            while(zeros > k){
                if(nums[p1] == 0){
                    zeros--;
                }
                p1++;
            }
            maxlen = Math.max(maxlen, p2-p1 + 1);
        }
        return maxlen;
    }
}