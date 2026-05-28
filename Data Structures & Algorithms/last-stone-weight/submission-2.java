class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> q=new PriorityQueue<>(
            (a,b) -> b-a
        );

        for(int i:stones){
            q.add(i);
        }

        while(q.size()>1){
            int first=q.poll();
            int second=q.poll();

            if(first!=second){
                q.add(Math.abs(first-second));
            }
        }

        if(q.size()==0) return 0;
        return q.peek();
    }
}
