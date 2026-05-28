class Solution {

    public void help(int index,int nums[],int left,List<List<Integer>> result,List<Integer> current )
    {   
        if(left==0){
            result.add(new ArrayList<>(current));
        }
        if(left<0) return;

        for(int i=index;i<nums.length;i++){
            current.add(nums[i]);
            help(i,nums,left-nums[i],result,current);
            current.remove(current.size()-1);
        }
        

    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        help(0,nums,target,res,current);
        return res;
    }
}
