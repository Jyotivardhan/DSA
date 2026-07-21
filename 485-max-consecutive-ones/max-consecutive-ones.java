class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int maximum = 0;
        int count = 0;
        for(int i=0;i<n; i++){
            if(nums[i]==1){
                count += 1;
                maximum = Math.max(maximum,count);
            }else{
                count = 0;
            }
        }
        return maximum;
    }
}