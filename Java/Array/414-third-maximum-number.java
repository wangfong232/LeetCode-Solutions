/*
 * @lc app=leetcode id=414 lang=java
 *
 * [414] Third Maximum Number
 *
 * https://leetcode.com/problems/third-maximum-number/description/
 *
 * algorithms
 * Easy (39.33%)
 * Likes:    3565
 * Dislikes: 3551
 * Total Accepted:    844.3K
 * Total Submissions: 2.1M
 * Testcase Example:  '[3,2,1]'
 *
 * Given an integer array nums, return the third distinct maximum number in
 * this array. If the third maximum does not exist, return the maximum
 * number.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [3,2,1]
 * Output: 1
 * Explanation:
 * The first distinct maximum is 3.
 * The second distinct maximum is 2.
 * The third distinct maximum is 1.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [1,2]
 * Output: 2
 * Explanation:
 * The first distinct maximum is 2.
 * The second distinct maximum is 1.
 * The third distinct maximum does not exist, so the maximum (2) is returned
 * instead.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: nums = [2,2,3,1]
 * Output: 1
 * Explanation:
 * The first distinct maximum is 3.
 * The second distinct maximum is 2 (both 2's are counted together since they
 * have the same value).
 * The third distinct maximum is 1.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 10^4
 * -2^31 <= nums[i] <= 2^31 - 1
 * 
 * 
 * 
 * Follow up: Can you find an O(n) solution?
 */

// @lc code=start
class Solution {
    /**
     * Problem: 414. Third Maximum Number
     * Difficulty: Easy
     * THOUGHT PROCESS:
     * - Duy trì 3 biến đại diện cho 3 số duy nhất.
     * - sử dụng kiểu Integer để khởi tạo bằng null.
     * - Sẽ không phải Integer.MIN_VALUE gây ra lỗi khi mảng cũng có giá trị đúng bằng Integer.MIN_VALUE. 
     * - Khi duyệt qua mảng: 
     * 1. Nếu nó đã tồn tại thì bỏ qua (vì đề bài yêu cầu distinct).
     * 2. Nếu nó lớn hơn max1 (số lớn nhất) -> gán nó là số lớn nhất và đẩy lùi các số cũ xuống max3 = max2, max2 = max1 
     * 3. Tương tự cho max2 và max3. 
     * 
     * COMPLEXITY: 
     * - Time Complexity: O(n) - duyệt vòng for
     * - Space Complexity: O(1) - không tạo thêm biến ngoài max1,2,3.  
     * 
     */
    public int thirdMax(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer n : nums) {

            if (n.equals(max1) || n.equals(max2) || n.equals(max3))
                continue;

            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return (max3 == null) ? max1 : max3;
    }
}
// @lc code=end
