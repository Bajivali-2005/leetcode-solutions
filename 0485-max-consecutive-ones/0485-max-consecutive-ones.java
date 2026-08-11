class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int p1 = 0;

        int count = 0;
        int maxcount = 0;

        for(int p2 = 0; p2<nums.length; p2++){
            if(nums[p2]==1){
                count++;
                if(count > maxcount){
                    maxcount = count;
                }
            }else{
                p1=p2;
                count = 0;
            }
        }
        return maxcount;
    }
}