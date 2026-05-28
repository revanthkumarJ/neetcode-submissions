class Solution {
    public boolean isAnagrams(String a ,String b){
        int array[]=new int[26];

        for(char c:a.toCharArray()){
            array[c-'a']++;
        }
        for(char c:b.toCharArray()){
            array[c-'a']--;
        }
        for(int i=0;i<26;i++){
            if(array[i]!=0)
            return false;
        }
        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashSet<String>set =new HashSet<>();
        List<List<String>> result=new ArrayList<>();

        for(int i=0;i<strs.length;i++){
            String s=strs[i];
        
            if(!set.contains(s)){
                List<String> list=new ArrayList<>();
                list.add(s);
                for(int j=i+1;j<strs.length;j++){
                    if(isAnagrams(s,strs[j])){
                        list.add(strs[j]);
                        set.add(strs[j]);
                    }
                }
                result.add(list);
            }
        }
        return result;
    }
}
