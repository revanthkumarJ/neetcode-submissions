class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0) return 0;
        int curr =nums.length-1;
        for(int i=0;i<curr;){
            if(nums[i]==val){
                nums[i]=nums[curr];
                nums[curr]=val;
                if(nums[i]!=val)
                i++;
                curr--;
                
            }
            else{
                i++;
            }
        }
        if(curr==0) return 0;
        if(nums[curr]==val)
        return curr;
        else
        return curr+1;

    }
}