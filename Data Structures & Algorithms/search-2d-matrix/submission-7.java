class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int currentRow=-1;

        if(matrix[0][0]>target) return false;
        int m=matrix.length;
        if(m==0) return false;
        int n=matrix[0].length;
        if(n==0) return false;

        for(int i=0;i<m;i++){
            if(matrix[i][0]==target){
                return true;
            }
            if(matrix[i][0]>target){
                currentRow=i-1;
                break;
            }
        }

        if(currentRow==-1)
        currentRow=m-1;

        int start=0;
        int end=n-1;

        while(start<=end){
            int mid= (start)+(end-start)/2;
            int midValue=matrix[currentRow][mid];

            if(midValue==target) return true;
            if(midValue>target)
            end=mid-1;
            else 
            start=mid+1;
        }

        return false;

    }
}
