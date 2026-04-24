/* Example 1:
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].*/
//The Time and Space complexity of this solution :- Time complexity=O(n), Space complexity=O(1)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;
        while(l<r){
            if(numbers[l]+numbers[r]>target){
                r--;
                }
            else if(numbers[l]+numbers[r]<target){
                l++;
                }
            else{
                 return new int[]{l+1,r+1};
                 }
        }
        return null;
    }
    }