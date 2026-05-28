class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];

        int left=0;
        int right=0;

        int ans=0;
        int maxOccurance=0;

        for(;right<s.length();right++){
            maxOccurance = Math.max(maxOccurance,++freq[s.charAt(right)-'A']);
            if(right-left+1-maxOccurance >k){
                
                freq[s.charAt(left)-'A']--;
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }

        return ans;
    }
}
