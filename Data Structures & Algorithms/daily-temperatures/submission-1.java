class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n= temperatures.length;

        int res[] = new int[n];

        for(int i=n-1;i>=0;i--){
            int j=i+1;

            while(j<n){
                if(temperatures[j]>temperatures[i]){
                    res[i]=j-i;
                    break;
                }
                if(res[j]==0) break;
                j+=res[j];
            }
        }

        return res;

    }
}
