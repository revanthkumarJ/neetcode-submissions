class Solution {
    HashMap<Integer, Integer> map;

    public int minCost(int[] cost, int i) {
        if (i >= cost.length) {
            return 0;
        }

        if (map.containsKey(i)) {
            return map.get(i);
        }

        int res = cost[i] + Math.min(
            minCost(cost, i + 1),
            minCost(cost, i + 2)
        );

        map.put(i, res);
        return res;
    }

    public int minCostClimbingStairs(int[] cost) {
        map = new HashMap<>();

        return Math.min(
            minCost(cost, 0),
            minCost(cost, 1)
        );
    }
}