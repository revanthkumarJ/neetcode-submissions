class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroes=0;
        int total=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroes++;
            }
            else{
                total=total*nums[i];
            }
        }

        int res[]=new int[nums.length];
        
            if(zeroes>=2){
                for(int i=0;i<nums.length;i++){
                    res[i]=0;
                }
            }
            else{
                for(int i=0;i<nums.length;i++){
                    if(nums[i]==0){
                    res[i]=total;
                }
                else if(zeroes==1){
                    res[i]=0;
                }
                else{
                    res[i]=total/nums[i];
                }
                }
                
            }

            return res;
    }
}  
