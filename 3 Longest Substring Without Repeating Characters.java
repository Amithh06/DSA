// Example 1:
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc",
//  with the length of 3. Note that "bca" and "cab" are also correct answers.
//The Time and Space complexity of this solution :- Time complexity=O(n), Space complexity=O(longest substring)

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s == null || s.length()==0){
            return 0;
        }
        
        if(s.length() == 1){
            return 1;
        }
        
        int left = 0;
        int right = 0;
        int ans = 0;
        
        HashSet<Character> set = new HashSet<>();
        
        while(right < s.length()){
            char c = s.charAt(right);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            ans = Math.max(ans, right-left + 1);
            right++;
        }
        
        return ans;
    }
}