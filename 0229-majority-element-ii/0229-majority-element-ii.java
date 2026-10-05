class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> sol=new ArrayList<>();
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        for(int key:freq.keySet()){
            if(freq.get(key)>nums.length/3){
                sol.add(key);
            }
        }
        return sol;
    }
}