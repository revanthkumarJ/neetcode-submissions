class Solution {
    public void sortColors(int[] nums) {
        int start =0;
        int last =nums.length-1;

        for(int i=0;i<=last;){
            if(nums[i]==0){
                if(i==start)
                start++;
                else {
                    nums[i]=nums[start];
                    nums[start]=0;
                    start++;
                }
                i++;
            }
            else if(nums[i]==2){
                nums[i]=nums[last];
                nums[last]=2;
                last--;
                if(nums[i]!=2 && nums[i]!=0)
                i++;
            }
            else
            i++;
        }
    }
}