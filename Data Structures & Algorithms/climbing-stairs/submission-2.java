class Solution {
    HashMap<Integer,Integer> map;
    public int climb(int n){
        if(n==0)
        return 1;
        if(map.containsKey(n))
        return map.get(n);
        int res= climb(n-1);
        if(n-2>=0)
        res+=climb(n-2);
        map.put(n,res);
        return res;
    }
    public int climbStairs(int n) {
        map = new HashMap<>();
        return climb(n);
    }
}
