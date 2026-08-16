class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int water = 0;

        int leftdp [] = new int[n];
        int rightdp [] = new int[n];

        leftdp[0] = height[0];
        rightdp[n-1] = height[n-1];

        for(int i = 1; i<n; i++){
            leftdp[i] = Math.max(leftdp[i-1],height[i]);
        }

        for(int i = n-2; i>=0; i--){
            rightdp[i] = Math.max(rightdp[i+1],height[i]);
        }

        for(int i = 0; i<n; i++){
            water += Math.min(leftdp[i],rightdp[i]) - height[i];
        }
        return water;
    }
}