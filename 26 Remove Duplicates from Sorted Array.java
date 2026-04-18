/*Example 1:
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */
// The Time and Space complexity of this solution :- Time complexity=O(n), Space complexity=O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int index=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}