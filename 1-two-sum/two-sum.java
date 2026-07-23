class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ob = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target-nums[i];
            if(ob.containsKey(complement)){
                return new int[]{ob.get(complement),i};
            } 
            ob.put(nums[i],i);
        }
        return new int[]{};
    }
}