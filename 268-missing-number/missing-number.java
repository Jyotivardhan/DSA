class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int allXOR = 0;
        for(int i=0 ; i<n+1 ; i++){
            allXOR = allXOR^i ;
        }
        for(int num : nums){
            allXOR = allXOR ^ num;
        }
        return allXOR;
    }
}