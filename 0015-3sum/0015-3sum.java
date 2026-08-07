class Solution {
    public List<List<Integer>> threeSum(int[] arr) {

        Set<List<Integer>> list = new HashSet<>();
        
        int n = arr.length;

        for(int i = 0; i<n; i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j = i+1; j<n;j++){
                int third = -(arr[i]+arr[j]);

                if(set.contains(third)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(third);
                    Collections.sort(temp);

                    list.add(temp);

                }
                set.add(arr[j]);
            }
        }
        return new ArrayList<>(list);
    }
}