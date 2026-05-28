class Solution {
    public int reverse(int x) {
        long res=0;
        boolean isNeg=false;
        if(x<0){
            isNeg=true;
            x=-1*x;
        }
        while(x>0){
            res=res*10+(x%10);
            x=x/10;
        }
        if(res>Integer.MAX_VALUE) return 0;
        if(isNeg){
            return -1*(int)res;
        }
        return (int)res;
    }
}
