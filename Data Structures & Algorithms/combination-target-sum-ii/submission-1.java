class Solution {
    
    public void help(int index,int nums[],int left,List<List<Integer>> result,List<Integer> current )
    {   
        if(left==0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(left<0) return;
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]){
                continue;
            }
            current.add(nums[i]);
            help(i+1,nums,left-nums[i],result,current);
            current.remove(current.size()-1);
        }

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        help(0,candidates,target,res,current);
        return res;
    }
}
