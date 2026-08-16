class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int water = 0;

        int p1 = 0;
        int p2 = n-1;

        int leftmax = 0;
        int rightmax = 0;

        while(p1<=p2){

            if(height[p1] <= height[p2]){

                if(height[p1] > leftmax){
                    leftmax = height[p1];
                }else{
                    water += leftmax - height[p1];
                }

                p1++;
            }else{

                if(height[p2] > rightmax ){
                    rightmax = height[p2];
                }else{
                    water += rightmax - height[p2];
                }
                p2--;
            }
        }
        return water;
    }
}