/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 *
 * https://leetcode.com/problems/move-zeroes/description/
 *
 * algorithms
 * Easy (63.80%)
 * Likes:    19515
 * Dislikes: 607
 * Total Accepted:    5.1M
 * Total Submissions: 8M
 * Testcase Example:  '[0,1,0,3,12]'
 *
 * Given an integer array nums, move all 0's to the end of it while maintaining
 * the relative order of the non-zero elements.
 * 
 * Note that you must do this in-place without making a copy of the array.
 * 
 * 
 * Example 1:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Example 2:
 * Input: nums = [0]
 * Output: [0]
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
 * Follow up: Could you minimize the total number of operations done?
 */

// @lc code=start
class Solution {
    /**
     * Problem: 283. Move Zeroes
     * Difficulty: Easy
     * THOUGHT PROCESS:
     * - Sử dụng kỹ thuật Two Pointers:
     * + Pointer 'j' (slow): Giữ vị trí cho số khác 0 tiếp theo.
     * + Pointer 'i' (fast): Duyệt qua toàn bộ mảng.
     * - Khi 'nums[i]' khác 0, ta hoán đổi (swap) nó với vị trí 'j'.
     * 
     * COMPLEXITY:
     * - Time Complexity: O(n) - Chỉ duyệt qua mảng đúng 1 lần.
     * - Space Complexity: O(1) - Xử lý trực tiếp trên mảng (In-place).
     */
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;
            }
        }
    }
}
// @lc code=end
