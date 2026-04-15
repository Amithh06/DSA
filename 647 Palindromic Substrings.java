/*Example 1:
Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c". */
// The Time and Space complexity of this solution :- Time complexity=O(n2), Space complexity=O(n)
class Solution {
    public int countSubstrings(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            ans+=checkPalindrome(s,i,i);
             ans+=checkPalindrome(s,i,i+1);

        }
        return ans;
    }

    public int checkPalindrome(String s,int left,int right) {
        int count=0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            count++;;
             left--;
             right++;
        }
        return count;
    }
}