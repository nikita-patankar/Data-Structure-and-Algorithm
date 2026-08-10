class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seenNumbers = new HashSet<>();

        for(int num : nums) {
            if(seenNumbers.contains(num)) {
                return true; //Duplicate Found
            }
            seenNumbers.add(num);
        }

        return false; //No duplicate Found
    }
}