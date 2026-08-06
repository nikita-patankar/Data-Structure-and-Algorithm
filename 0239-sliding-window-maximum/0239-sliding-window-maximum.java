class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

       List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();


        for(int i = 0 ; i < k ; i++){
            while(dq.size()>0 && nums[i] >= nums[dq.getLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }

        result.add(nums[dq.getFirst()]);

        //Process Remaining elements
        for(int i = k ; i < nums.length ; i++){
            //Remove element out of window 
            if(i - dq.getFirst() >= k){
                dq.removeFirst();
            }

            //Remove smaller element 
            while (!dq.isEmpty() && nums[i] > nums[dq.getLast()]){
                dq.removeLast();
            }

            dq.addLast(i);
            result.add(nums[dq.getFirst()]);
        }

        //Covert list to array
        int[] resArr = new int[result.size()];
        for(int i=0 ; i<result.size(); i++){
            resArr[i] = result.get(i);
        } 

        return resArr;
        
    }
}