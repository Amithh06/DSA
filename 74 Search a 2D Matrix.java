/*
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true */
// The Time and Space complexity of this solution :- Time complexity=O(log(m*n)), Space complexity=O(1)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int m=matrix.length;
       int n=matrix[0].length;
       int right=m+n-1;
       int left=0;
       while(left<=right){
        int mid=left+(right-left)/2;
        int midvalue=matrix[mid/n][mid%n];
        if(midvalue==target){
            return true;
        }else if(midvalue<target){
            left=mid+1;
        }else{
            right=mid-1;
        } } 
       return false;
    }
}