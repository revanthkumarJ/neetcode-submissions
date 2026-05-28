class Solution {
    public int trap(int[] height) {
        int n=height.length;

        int ll=height[0];
        int rr=height[n-1];

        int lmax[] = new int[n];
        int rmax[] = new int[n];

        for(int i=0;i<n;i++){
            if(height[i]>ll){
                ll=height[i];
            }
            if(height[n-i-1]>rr){
                rr=height[n-i-1];
            }

            lmax[i]=ll;
            rmax[n-i-1]=rr;
        }

        int res=0;

        for(int i=0;i<n;i++){
            int curr=height[i];
            int min= Math.min(lmax[i],rmax[i]);
            if(curr<min){
                res+=(min-curr);
            }
        }

        return res;
    }
}
