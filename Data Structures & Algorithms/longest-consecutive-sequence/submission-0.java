class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        HashSet<Integer> set=new HashSet<>();

        for(int i:nums){
            set.add(i);
        }

        for(int i:nums){
            if(!set.contains(i-1)){
                int val=1;
                for(int j=i+1;;j++){
                    if(set.contains(j)){
                        val++;
                    }
                    else{
                        break;
                    }
                }
                if(val>max)
                max=val;
            }
        }

        return max;
    }
}
