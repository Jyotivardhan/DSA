class Solution {
    public int majorityElement(int[] nums) {
        int n= nums.length;
        HashMap<Integer,Integer> ob = new HashMap<>();
        for(int i=0; i<n; i++){
            if(ob.containsKey(nums[i])){
                ob.put(nums[i],ob.get(nums[i])+1);
            }else{
                ob.put(nums[i],1);
            }
        }
        for(int key:ob.keySet()){
            if(ob.get(key)>n/2){
                return key;
            }
        }
        return 0;
    }
}