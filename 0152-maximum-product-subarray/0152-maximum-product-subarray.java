class Solution {
    public int maxProduct(int[] arr) {
        int maxEnding=arr[0];
        int minEnding=arr[0];
        int result=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
                int temp=maxEnding;
                maxEnding=minEnding;
                minEnding=temp;
            }
            maxEnding=Math.max(arr[i],maxEnding*arr[i]);
            minEnding=Math.min(arr[i],minEnding*arr[i]);
            result=Math.max(result,maxEnding);
        }
        return result;
    }
}