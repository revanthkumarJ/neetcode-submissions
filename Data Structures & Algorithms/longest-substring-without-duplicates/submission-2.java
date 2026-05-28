class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int n=s.length();
        int max=0;
        int l=0;

        for(int r=0;r<n;r++){
            char current=s.charAt(r);
            if(set.contains(current)){
                while(set.contains(current)){
                    set.remove(s.charAt(l));
                    l++;
                }
                set.add(current);
                int rr=r-l+1;
                if(rr>max)
                max=rr;
            }
            else{
                set.add(current);
                if(r-l+1>max)
                max=r-l+1;
            }
        }

        return max;
    }
}
