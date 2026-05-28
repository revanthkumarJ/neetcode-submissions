class Solution {
    public int[] twoSum(int[] num, int target) {
        int start=0;
        int end=num.length-1;

        while(start<end){
            int curr=num[start]+num[end];
            if(curr==target){
                return new int[]{start+1,end+1};
            }
            if(curr<target)
            start++;
            else
            end--;
        }
        return new int[]{-1,-1};
    }
}
