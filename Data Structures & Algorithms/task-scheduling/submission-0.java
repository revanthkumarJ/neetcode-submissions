class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        HashMap<Character,Integer> map= new HashMap<>();

        for(char c:tasks){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        PriorityQueue<Integer> pq=new PriorityQueue<>(
            (a,b)->b-a
        );

        pq.addAll(map.values());

        int time=0;

        while(!pq.isEmpty()){
            List<Integer> temp= new ArrayList<>();

            for(int i=0;i<n+1;i++){
                if(!pq.isEmpty())
                temp.add(pq.poll());
            }

            for(int i:temp){
                if(i-1>0)
                pq.add(i-1);
            }

            time+=pq.isEmpty() ? temp.size() : n+1;
        }

        return time;
    }
}
