class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        int res[]= new int[26];

        for(char a:s.toCharArray()){
            res[a-'a']++;
        }

        for(char c:t.toCharArray()){
            res[c-'a']--;
        }

        for(int i=0;i<26;i++){
            if(res[i]!=0) return false;
        }

        return true;
    }
}
