/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 *
 * https://leetcode.com/problems/plus-one/description/
 *
 * algorithms
 * Easy (49.91%)
 * Likes:    11891
 * Dislikes: 5611
 * Total Accepted:    3.7M
 * Total Submissions: 7.5M
 * Testcase Example:  '[1,2,3]'
 *
 * You are given a large integer represented as an integer array digits, where
 * each digits[i] is the i^th digit of the integer. The digits are ordered from
 * most significant to least significant in left-to-right order. The large
 * integer does not contain any leading 0's.
 * 
 * Increment the large integer by one and return the resulting array of
 * digits.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 * digits does not contain any leading 0's.
 * 
 * 
 */

// @lc code=start
class Solution {
    /**
     * Problem: 66. Plus One
     * Difficulty: Easy
     * THOUGHT PROCESS:
     * Mục tiêu: cộng 1 vào số được biểu diễn bởi mảng digits 
     * Cách tiếp cận: Ta duyệt từ cuối lên đầu. 
     * * Nếu chữ số hiện tại < 9, Cộng 1 luôn và trả về mảng (vd: 123, return 124)
     * * Nếu chữ số hiện tại = 9, tận dụng vòng lặp, reset số hiện tại = 0 (nhớ) và chạy đến số trước; nếu số trước < 9 thì + 1 và return.
     * Trường hợp đặc biệt: Nếu mảng toàn 9, sau vòng lặp ta được mảng [0,0]. Lúc này ta cần tạo mảng mới [1,0,0] để trả về. 
     * COMPLEXITY:
     * - Time Complexity: O(n) - Duyệt qua mảng tối đa một lần.
     * - Space Complexity: O(n) - Trong trường hợp xấu nhất (toàn số 9), cần tạo
     * mảng mới size n+1.
     */
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // case 9, 999
        int[] rs = new int[n + 1];
        rs[0] = 1;
        return rs;
    }
}
// @lc code=end
