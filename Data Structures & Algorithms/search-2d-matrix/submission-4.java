class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int currRow=1;
        for(currRow=0;currRow<matrix.length;currRow++){
            if(matrix[currRow][0]==target) return true;
            if(matrix[currRow][0]>target){
                break;
            }
        }
        currRow--;
        if(currRow<0) return false;
        int low=0;
        int high=matrix[0].length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int val=matrix[currRow][mid];
            if(val==target){
                return true;
            }
            else if(val>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
}
