class Solution {
    public int subarraySum(int[] nums, int k) {
       int sum = 0;
       int presum = 0;
       int ans = 0;

       HashMap<Integer , Integer > map = new HashMap<>();
       map.put(0,1);

       for(int i = 0 ; i < nums.length ; i++){
        presum = presum + nums[i];
       

       if(map.containsKey(presum - k)){
        ans = ans + map.get(presum - k);
       }

        map.put(presum, map.getOrDefault(presum, 0) + 1);
       }
        return ans ;
    }
}