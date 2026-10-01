class Solution {
    public int majorityElement(int[] nums) {
        int max=-1;
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(i==0){
                max=nums[j];
                i=1;
            }
            else if(max==nums[j]){
                i++;
            }
            else{
                i--;
            }
            
        }
    return max;
    }
}