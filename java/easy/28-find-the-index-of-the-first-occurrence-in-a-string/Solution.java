/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 *
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
 *
 * algorithms
 * Easy (46.60%)
 * Likes:    7646
 * Dislikes: 585
 * Total Accepted:    4.1M
 * Total Submissions: 8.7M
 * Testcase Example:  '"sadbutsad"\n"sad"'
 *
 * Given two strings needle and haystack, return the index of the first
 * occurrence of needle in haystack, or -1 if needle is not part of
 * haystack.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= haystack.length, needle.length <= 10^4
 * haystack and needle consist of only lowercase English characters.
 * 
 * 
 */

// @lc code=start
class Solution {

    /**
     * Problem: 28. Find the Index of the First Occurrence in a String
     * Difficulty: Easy
     * THOUGHT PROCESS:
     * Mục tiêu: tìm vị trí đầu tiên của chuỗi needle trong chuỗi haystack.
     * Cách tiếp cận: Sử dụng phương thức indexOf của lớp String để tìm kiếm vị trí
     * của needle trong haystack.
     * Nếu haystack có độ dài nhỏ hơn needle, trả về -1 ngay lập tức.
     * Nếu không, gọi haystack.indexOf(needle) để tìm vị trí của needle trong
     * haystack.
     * Cơ chế: Java sử dụng thuật toán so khớp chuỗi cơ bản (Brute Force). Nó duyệt
     * qua từng vị trí trong haystack và so sánh với needle cho đến khi tìm thấy
     * hoặc hết haystack.
     * Ưu điểm: Code ngắn, dễ tiếp cận và sử dụng sẵn các phương thức của Java.
     * COMPLEXITY:
     * Time Complexity: O(n*m). Trong trường hợp xấu nhất (ví dụ: haystack là
     * "aaaaaaaaab" và needle là "aaab"), ta phải duyệt gần như toàn bộ haystack và
     * mỗi lần lại so sánh hết needle.
     * Space Complexity: O(1)
     */
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        return haystack.indexOf(needle);
    }
}
// @lc code=end
