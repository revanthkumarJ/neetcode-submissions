class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(String s:strs){
            String hashKey = getHashKey(s);
            if(map.containsKey(hashKey)){
                map.get(hashKey).add(s);
            }
            else{
                ArrayList<String> newList = new ArrayList<>();
                newList.add(s);
                map.put(hashKey,newList);
            }
        }

        return new ArrayList(map.values());
    }

    public String getHashKey(String word){
        int res[]= new int[26];

        for(char c:word.toCharArray()){
            res[c-'a']++;
        }

        StringBuilder result = new StringBuilder("");

        for(int i=0;i<26;i++){
            result.append('#').append(res[i]);
        }
        return new String(result);
    }
}
