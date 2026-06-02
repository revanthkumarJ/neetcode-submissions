class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        int max = strs[0].length();

        for(int i=1;i<strs.length;i++){
            String curr= strs[i];
            max = Math.min(max,curr.length());
            for(int j=0;j<max;j++){
                if(strs[0].charAt(j)!=curr.charAt(j))
                {
                    if(j==0) return "";
                    max=j;
                    break;
                }
            }
        }

        return strs[0].substring(0,max);
    }
}