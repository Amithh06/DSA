/*Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
In this case, the max area of water (blue section) the container can contain is 49.*/
//The Time and Space complexity of this solution :- Time complexity=O(n), Space complexity=O(1)

 class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int res=0;
        while(l<r){
            int width=r-l;
            int area=Math.min(height[l],height[r])*width;
            res=Math.max(res,area);
            if(height[l]<=height[r]){
                l++;
            }else{
                r--;
            }  
        }
        return res;
    }
}