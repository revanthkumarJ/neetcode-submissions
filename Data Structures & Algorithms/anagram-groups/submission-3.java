class Solution {
    public String represen(String s){
        int res[]= new int[26];
        for(char c:s.toCharArray()){
            res[c-'a']++;
        }

        StringBuilder resS = new StringBuilder("");
        for(int i:res){
            resS.append(i);
            resS.append("-");
        }

        return new String(resS);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(String s : strs){
            String rep = represen(s);
            if(map.containsKey(rep)){
                map.get(rep).add(s);
            }
            else{
                List<String> newList = new ArrayList<>();
                newList.add(s);
                map.put(rep,newList);
            }
        }

        return new ArrayList<>(map.values());
    }
}
