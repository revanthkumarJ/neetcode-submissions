class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";

        int max = strs[0].length();

        for(int i=1;i<strs.length;i++){
            max = Math.min(max,strs[i].length());
            int j=0;
            while(j<max){
                if(strs[i].charAt(j)==strs[i-1].charAt(j)){
                    j++;
                }
                else{
                    max= j;
                    break;
                }
            }
        }

        return strs[0].substring(0,max);
    }
}