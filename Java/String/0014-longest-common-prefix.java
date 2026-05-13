/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 *
 * https://leetcode.com/problems/longest-common-prefix/description/
 *
 * algorithms
 * Easy (47.51%)
 * Likes:    21433
 * Dislikes: 4939
 * Total Accepted:    5.8M
 * Total Submissions: 12.1M
 * Testcase Example:  '["flower","flow","flight"]'
 *
 * Write a function to find the longest common prefix string amongst an array
 * of strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters if it is non-empty.
 * 
 * 
 */

// @lc code=start


class Solution {
    /**
     * Problem:
     * Difficult: Easy
     * THOUGHT PROCESS:
     * Các tiếp cận: Giả định chuỗi đầu tiên là prefix. 
     * Duyệt qua các chuỗi còn lại trong mảng.
     * Sử dụng hàm indexOf() để kiểm tra chuỗi hiện tại có bắt đầu bằng prefix không. 
     * Nếu không, cắt bớt ký tự cuối cho đến khi khớp hoặc rỗng. 
     * COMPLEXITY:
     * Time Complexity: O(S) - S là tổng ký tự của tất cả các chuỗi
     * Space Complexity: O(1) - Sử dụng 1 biến string 'prefix'
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                  if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
}
// @lc code=end
