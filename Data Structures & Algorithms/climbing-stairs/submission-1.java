class Solution {
    HashMap<Integer,Integer> map ;
    public int climb(int n){
        if(n==0) return 1;
        if(n<0) return 0;
        if(map.containsKey(n)) return map.get(n);
        int res = climb(n-1)+climb(n-2);
        map.put(n,res);
        return res;
    }
    public int climbStairs(int n) {
        map = new HashMap<>();
        return climb(n);
    }
}
