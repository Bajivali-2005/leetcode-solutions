class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        List<List<Integer>> list = new ArrayList<>();

        for(int i =0; i<n-2; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }

            int p1 = i+1;
            int p2 = n-1;

            while(p1<p2){
                int sum = nums[p1] + nums[p2] + nums[i];

                if(sum == 0){
                    List<Integer> ans = new ArrayList<>();
                    ans.add(nums[p1]);
                    ans.add(nums[p2]);
                    ans.add(nums[i]);
                    list.add(ans);

                    p1++;
                    p2--;

                    while(p1<p2 && nums[p1] == nums[p1-1]){
                        p1++;
                    }
                    while(p1<p2 && nums[p2] == nums[p2+1]){
                        p2--;
                    }
                }else if(sum<0){
                    p1++;
                }else{
                    p2--;
                } 
            }

        }
        return list;
    }
}