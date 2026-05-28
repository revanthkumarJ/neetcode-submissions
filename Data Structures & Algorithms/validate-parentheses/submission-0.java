class Solution {
    public boolean isSame(char a,char b){
        return (a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}');
    }
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                st.push(c);
            }
            else{
                if(st.isEmpty())
                return false;
                if(!isSame(st.pop(),c))
                return false;
            }
        }
        return st.isEmpty();
    }
}
