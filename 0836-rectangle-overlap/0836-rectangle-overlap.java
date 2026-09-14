class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x5=Math.max(rec1[0],rec2[0]);
        int x6=Math.min(rec1[2],rec2[2]);
        int y5=Math.max(rec1[1],rec2[1]);
        int y6=Math.min(rec1[3],rec2[3]);
        if(x5<x6 && y5<y6){
            return true;
        }
        return false;
    }
}