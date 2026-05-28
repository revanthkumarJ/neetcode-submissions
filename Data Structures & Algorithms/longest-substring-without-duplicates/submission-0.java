class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int max=0;
        int l=0;

        for(int r=0;r<s.length();r++){
            if(set.contains(s.charAt(r))){
                while(s.charAt(r)!=s.charAt(l)){
                    set.remove(s.charAt(l));
                    l++;
                }
                    l++;
                max=Math.max(max,r-l+1);
            }
            else{
                set.add(s.charAt(r));
                max=Math.max(max,r-l+1);
            }
        }

        return max;

    }
}
