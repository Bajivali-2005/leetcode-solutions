class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k <= 1) {
            return 0;
        }

        int n = nums.length;
        int product = 1;
        int p1 = 0;
        int count = 0;

        for (int p2 = 0; p2 < n; p2++) {

            product = product * nums[p2];

            while (product >= k) {
                product /= nums[p1];
                p1++;
            }

            count += p2 - p1 + 1;
        }

        return count;
    }
}