/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 *
 * https://leetcode.com/problems/length-of-last-word/description/
 *
 * algorithms
 * Easy (58.76%)
 * Likes:    6462
 * Dislikes: 365
 * Total Accepted:    3.4M
 * Total Submissions: 5.8M
 * Testcase Example:  '"Hello World"'
 *
 * Given a string s consisting of words and spaces, return the length of the
 * last word in the string.
 * 
 * A word is a maximal substring consisting of non-space characters only.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * Explanation: The last word is "moon" with length 4.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: s = "luffy is still joyboy"
 * Output: 6
 * Explanation: The last word is "joyboy" with length 6.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 10^4
 * s consists of only English letters and spaces ' '.
 * There will be at least one word in s.
 * 
 * 
 */

// @lc code=start
class Solution {
    // OPTIMIZED SOLUTION

    /**
     * Problem: 58. Length of Last Word
     * Difficult: Easy
     * THOUGHT PROCESS:
     * - Mục tiêu: Tìm độ dài của từ cuối trong chuỗi.
     * - Cách tiếp cận: Các từ được phân cách bởi dấu cách, duyệt từ cuối đến khi
     * nào gặp khoảng trắng.
     * COMPLEXITY:
     * - Time Complexity: O(n). Trường hợp xấu nhất phải duyệt qua cả chuỗi. 
     * - Space Complexity: O(n).
     */

    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1; 
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            length++;
            i--;
        }
        return length;
    }

    /*
     * Problem: 58. Length of Last Word
     * Difficult: Easy
     * THOUGHT PROCESS:
     * - Mục tiêu: Tìm độ dài của từ cuối trong chuỗi.
     * - Cách tiếp cận: Sử dụng hàm trim() để xóa khoảng trắng đầu và cuối, sau đó
     * dùng split() chuỗi dựa trên khoảng trắng để lấy phần tử các mảng.
     * Ưu: ngắn gọn, dễ hiểu.
     * Nhược: Tạo ra mảng phụ (split) nếu TH có 10000 từ tốn rất nhiều RAM.
     * COMPLEXITY:
     * - Time Complexity: O(n). trim() và split() đều phải duyệt ra mảng.
     * - Space Complexity: O(n). split() tạo ra mảng tương đương với số từ.
     * 
     * public int lengthOfLastWord(String s) {
     * String[] strs = s.trim().split("\\s+");
     * return strs[strs.length-1].length();
     * }
     */
}
// @lc code=end
