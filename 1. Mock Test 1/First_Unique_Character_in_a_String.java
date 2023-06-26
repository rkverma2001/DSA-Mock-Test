/*
First Unique Character in a String

Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1

Constraints:
a. 1 <= s.length <= 10^5
b. s consists of only lowercase English letters.
 */
public class First_Unique_Character_in_a_String {
    public int firstUniqChar(String s) {
        int ans = Integer.MAX_VALUE;
        for(char c='a'; c<='z'; c++) {
            int i = s.indexOf(c);
            if(i!=-1 && i==s.lastIndexOf(c)) {
                ans = Math.min(ans, i);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        First_Unique_Character_in_a_String fs = new First_Unique_Character_in_a_String();
        int n = fs.firstUniqChar(s);
        System.out.println(n);
    }
}
