class Solution {
    public int majorityElement(int[] nums) {
        int sum=1;
        int major = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]==major)
            sum++;
            else{
                sum--;
                if(sum==0){
                    sum=1;
                    major=nums[i];
                }
            }
        }

        return major;
    }
}