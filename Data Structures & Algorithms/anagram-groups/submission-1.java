class Solution {
    public String getStringFormat(String s){
        int array[]=new int[26];

        for(char c:s.toCharArray()){
            array[c-'a']++;
        }

        StringBuilder res=new StringBuilder("");
        for(int i=0;i<26;i++){
            res.append(array[i]);
            res.append("-");
        }
        return new String(res);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();

        for(String s :strs){
            String r= getStringFormat(s);

            if(map.containsKey(r)){
                map.get(r).add(s);
            }
            else{
                List<String> newList=new ArrayList<>();
                newList.add(s);
                map.put(r,newList);
            }
        }
        return new ArrayList<>(map.values());
    }
}
