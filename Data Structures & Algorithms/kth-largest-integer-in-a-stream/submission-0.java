class KthLargest {

    int kval;
    Queue<Integer> queue;
    public KthLargest(int k, int[] nums) {
        queue= new PriorityQueue<>();
        kval=k;
        for(int i:nums){
            queue.add(i);
            if(queue.size()>kval){
                queue.poll();
            }
        }
    }
    
    public int add(int val) {   
        queue.add(val);
        if(queue.size()>kval){
            queue.poll();
        }
        return queue.peek();
    }
}
