class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> res=new ArrayList<>();

        for(int i:nums){
            if(!map.containsKey(i)){
                res.add(i);            }
            map.put(i,map.getOrDefault(i,0)+1);
        }

        Collections.sort(res, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return map.get(b)-map.get(a);
            }
        });

        int result[]=new int[k];
        for(int i=0;i<k;i++){
            result[i] = res.get(i);
        }
        return result;

    }
}
