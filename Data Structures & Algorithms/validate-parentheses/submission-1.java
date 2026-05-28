class Solution {
    public boolean Valid(char a,char b){
        return (a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}');
    }
    public boolean isValid(String s) {
        
        Stack<Character> st=new Stack<>();

        for(char c:s.toCharArray()){
            if(c=='{' || c=='[' || c=='('){
                st.push(c);
            }
            else{
                if(st.size()==0) return false;
                char ele= st.pop();
                if(!Valid(ele,c)) return false;
            }
        }

        return st.size()==0;
    }
}
