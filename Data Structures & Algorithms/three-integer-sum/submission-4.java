class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);

        int n=nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]>0)
            break;

            if(i>0 && nums[i-1]==nums[i])
            continue;

            int j=i+1;
            int k=n-1;

            while(j<k){
                int val= nums[i]+nums[j]+nums[k];
                if(val==0){
                    List<Integer> dd=new ArrayList<>();
                    dd.add(nums[i]);
                    dd.add(nums[j]);
                    dd.add(nums[k]);
                    res.add(dd);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                }
                else if(val>0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }

        return res;
    }
}
