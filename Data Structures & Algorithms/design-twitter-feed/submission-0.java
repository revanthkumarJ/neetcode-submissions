class Twitter {

    public static int timeStamp=0;

    private class User{

        int id;
        Set<Integer> followed;
        Tweet tweetHead;

        public User(int id){
            this.id=id;
            followed= new HashSet<>();
            follow(id);
            tweetHead =null;
        }

        public void follow(int id){
            followed.add(id);
        }

        public void unfollow(int id){
            if(id!=this.id){
                followed.remove(id);
            }
        }

        public void post(int id){
            Tweet newTweet = new Tweet(id);
            newTweet.next=tweetHead;
            tweetHead = newTweet;
        }
    }

    private class Tweet{
        int id;
        int time;
        Tweet next;

        public Tweet(int id){
            this.id=id;
            time=timeStamp++;
            next=null;
        }
    }

    private Map<Integer,User> map;

    public Twitter() {
        map= new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        if(!map.containsKey(userId)){
            User newUser= new User(userId);
            map.put(userId,newUser);
        }
        map.get(userId).post(tweetId);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> newsFeed = new LinkedList<>();

        if(!map.containsKey(userId)) return newsFeed;

        Set<Integer> followedUsers= map.get(userId).followed;

        PriorityQueue<Tweet> pq= new PriorityQueue<>(
            (a,b)-> b.time-a.time
        );

        for(int user:followedUsers){
            Tweet tw=map.get(user).tweetHead;
            if(tw!=null){
                pq.add(tw);
            }
        }

        int count=0;
        while(!pq.isEmpty() && count<10){
            Tweet tweet=pq.poll();
            newsFeed.add(tweet.id);
            count++;
            if(tweet.next!=null){
                pq.add(tweet.next);
            }
        }

        return newsFeed;
    }
    
    public void follow(int followerId, int followeeId) {
        if(!map.containsKey(followerId)){
            User newUser= new User(followerId);
            map.put(followerId,newUser);
        }
        if(!map.containsKey(followeeId)){
            User newUser= new User(followeeId);
            map.put(followeeId,newUser);
        }
        map.get(followerId).follow(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(map.containsKey(followerId) && followerId != followeeId){
            map.get(followerId).unfollow(followeeId);
        }
    }
}
