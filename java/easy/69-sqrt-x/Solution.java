/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 *
 * https://leetcode.com/problems/sqrtx/description/
 *
 * algorithms
 * Easy (41.76%)
 * Likes:    9732
 * Dislikes: 4642
 * Total Accepted:    3.2M
 * Total Submissions: 7.6M
 * Testcase Example:  '4'
 *
 * Given a non-negative integer x, return the square root of x rounded down to
 * the nearest integer. The returned integer should be non-negative as well.
 * 
 * You must not use any built-in exponent function or operator.
 * 
 * 
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: x = 4
 * Output: 2
 * Explanation: The square root of 4 is 2, so we return 2.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since we round it down
 * to the nearest integer, 2 is returned.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 0 <= x <= 2^31 - 1
 * 
 * 
 */

// @lc code=start
class Solution {
    /**
     * Problem: 69. Sqrt(x)
     * Difficulty: Easy
     * THOUGHT PROCESS:
     * Mục tiêu: Tìm căn bậc hai của một số nguyên không âm x, làm tròn xuống đến
     * số nguyên gần nhất.
     * Cách tiếp cận: Sử dụng phương pháp tìm kiếm nhị phân để tìm căn bậc hai của
     * x.
     * Ta tìm giá trị mid lớn nhất sao cho mid * mid <= x 
     * Cơ chế: Thuật toán tìm kiếm nhị phân có độ phức tạp thời gian O(log x) và độ
     * phức tạp không gian O(1).
     * Ưu điểm: Hiệu quả và nhanh chóng, đặc biệt đối với các giá trị lớn của x.
     * COMPLEXITY:
     * Time Complexity: O(log x) do sử dụng tìm kiếm nhị phân.
     * Space Complexity: O(1) vì chúng ta chỉ sử dụng một số biến để lưu trữ trạng
     * thái của tìm kiếm.
     */
    public int mySqrt(int x) {
        if (x < 2)
            return x;
        int left = 2;
        int right = x / 2;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            long num = (long) mid * mid;
            if (num == x)
                return mid;
            if (num < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}
// @lc code=end
