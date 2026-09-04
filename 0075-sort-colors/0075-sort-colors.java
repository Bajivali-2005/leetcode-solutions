class Solution {
    private void swap(int [] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int p1 = 0;
        int p2 = 0;
        int p3 = nums.length-1;

        while(p2<=p3){
            if(nums[p2]==0){               //checking mid everytime in if conditions
                swap(nums,p1,p2);          //Dutch national flag algorithm
                p1++;
                p2++;
            }else if(nums[p2]==1){
                p2++;
            }else{
                swap(nums,p2,p3);
                p3--;
            }
        }
    }
}