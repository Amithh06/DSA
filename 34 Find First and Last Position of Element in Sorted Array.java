/*Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4] */
// The Time and Space complexity of this solution :- Time complexity=O(log n), Space complexity=O(1)
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = this.findBound(nums, target, true);

        if(first == -1){
            return new int[]{-1,-1};
        }

        int last = this.findBound(nums, target, false);
        
        return new int[]{first,last};
    }

    public int findBound(int[] nums, int target, boolean isFirst){

        int start = 0;
        int end = nums.length - 1;

        while(start<= end){
            int mid = (start+end)/2;

            if(nums[mid] == target ){
                if(isFirst){

                if(mid == start || nums[mid-1]!= target){
                    return mid;
                }

                end = mid-1;

            }

            else{
                if(mid == end || nums[mid+1] != target){
                    return mid;
                }
                start = mid+1;
            }


            }
            
            else if(nums[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }

        }
        return -1;

    }}