class Solution {
    HashMap<Integer,Integer> map;
    public int robi(int i,int nums[]){
        if(i>=nums.length)
        return 0;
        if(map.containsKey(i))
        return map.get(i);
        int res = Math.max(robi(i+1,nums),nums[i]+robi(i+2,nums));
        map.put(i,res);
        return res;
    }
    public int rob(int[] nums) {
        map = new HashMap<>();
        return robi(0,nums);
    }
}
