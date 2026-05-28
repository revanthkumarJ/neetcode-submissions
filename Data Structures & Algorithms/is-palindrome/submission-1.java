class Solution {
    public boolean isPalin(String s){
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))
            return false;
            start++;
            end--;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        StringBuilder res=new StringBuilder("");

        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                res.append(c);
            }
        }

        return isPalin((new String(res)).toLowerCase());
    }
}
