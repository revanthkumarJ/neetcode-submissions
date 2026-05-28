class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int res[]=new int[n];

        for(int i=n-2;i>=0;i--){
            int j=i+1;
            while(j<n){
                if(temperatures[j]>temperatures[i]){
                    res[i]=j-i;
                    break;
                }
                if(res[j]!=0) j+=res[j];
                else j=n;
            }
        }

        return res;
    }
}
