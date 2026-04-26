/*Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.
 You may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3 */
//The Time and Space complexity of this solution :- Time complexity=O(n), Space complexity=O(n)
class Solution {
    public Map<Integer,Integer> countNums(int[] nums) {
        Map<Integer,Integer> count=new HashMap<Integer,Integer>();
        for(int i :nums){
            if(!count.containsKey(i)){
                count.put(i,1);
            }else{
                count.put(i,count.get(i)+1);
            }
        }
        return count;
        
    }
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> counts=countNums(nums);
        Map.Entry<Integer,Integer> majorityentry=null;

        for(Map.Entry<Integer,Integer> entry:counts.entrySet()){
            if(majorityentry==null||entry.getValue()>majorityentry.getValue()){
                majorityentry=entry;
            }
        }
        return majorityentry.getKey();
    }
}