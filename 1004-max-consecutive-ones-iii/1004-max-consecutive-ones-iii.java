class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxOnes=Integer.MIN_VALUE;
        int numReplacement=0;
        int windowStart=0;
        for(int windowEnd=0;windowEnd<nums.length;windowEnd++){
            if(nums[windowEnd]==0){
                numReplacement++;
            }
            while(numReplacement>k){
                if(nums[windowStart]==0){
                    numReplacement--;
                }
                windowStart++;
            }
            maxOnes=Math.max(maxOnes,windowEnd-windowStart+1);
        }
        return maxOnes;
    }
}