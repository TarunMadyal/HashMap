class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map <Integer,Integer> map = new HashMap<> ();
        for (int i=0; i<nums.length; i++){
            int current = nums[i];

            if(map.containsKey(current)){
                return true;
            }
            map.put(current,i);
        }
        return false;
    }
}
