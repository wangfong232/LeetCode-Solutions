/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 *
 * https://leetcode.com/problems/palindrome-number/description/
 *
 * algorithms
 * Easy (60.52%)
 * Likes:    15998
 * Dislikes: 2937
 * Total Accepted:    8.1M
 * Total Submissions: 13.4M
 * Testcase Example:  '121'
 *
 * Given an integer x, return true if x is a palindrome, and false
 * otherwise.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it
 * becomes 121-. Therefore it is not a palindrome.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a
 * palindrome.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * -2^31 <= x <= 2^31 - 1
 * 
 * 
 * 
 * Follow up: Could you solve it without converting the integer to a string?
 */

// @lc code=start
class Solution {
    /**
     * Problem: 9. Palindrome Number
     * Difficulty: Easy
     * THOUGHT PROCESS:
     * - The nature of palindrome numbers is that they read the same forwards and
     * backwards.
     * - Current method: Convert to a string to reverse.
     * - Advantages: The code is extremely short and easy to read.
     * - Disadvantages: It uses extra space to store the string representation of
     * the number.
     * COMPLEXITY:
     * * Time Complexity: O(n) - n is number of digits.
     * Space Complexity: O(n) - store string representation.
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        return sb.reverse().toString().equals(String.valueOf(x));
    }
}
// @lc code=end
