class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;

        HashSet<Integer> set=new HashSet<>();

        for(int i:nums){
            
            set.add(i);
        }

        for(int i:nums){
            int res=1;
            int val=i;
            while(set.contains(val-1)){
                val--;
                res++;
            }
            if(res>max)
            max=res;
        }

        return max;
    }
}
