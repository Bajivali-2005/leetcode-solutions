class Solution {
    public int[] rearrangeArray(int[] arr) {
        
        int[] nums = new int[arr.length];
        int p1 = 0;
        int p2 = 1;

        for(int num : arr){
            if(num > 0){
                nums[p1] = num;
                p1 += 2;
            }else{
                nums[p2] = num;
                p2 += 2; 
            }
        }
        return nums;
    }
}