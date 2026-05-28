class Solution {
    public boolean isPalin(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
            return false;
            i++;
            j--;
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
        return isPalin(new String(res).toLowerCase());
    }
}
