class Solution {
    public int[] twoSum(int[] num, int target) {
        int start=0;
        int end=num.length-1;

        while(start<end){
            int val=num[start]+num[end];
            if(val==target){
                return new int[]{start+1,end+1};
            }
            else if(val>target){
                end--;
            }
            else{
                start++;
            }
        }
        return new int[0];
    }
}
