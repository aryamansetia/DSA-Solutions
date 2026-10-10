class Solution {
    public int commonFactors(int a, int b) {
        if(a<2||b<2){
            return 1;
        }
        int count=1;
        for(int i=2;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }
}