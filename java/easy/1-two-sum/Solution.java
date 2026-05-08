/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    /**
     * Problem: 1. Two Sum
     * Difficulty: Easy
     * Language: Java
     * * Logic:
     * Sử dụng 2 vòng lặp (Brute Force) để kiểm tra mọi cặp số (i, j).
     * Nếu nums[i] + nums[j] == target, trả về cặp chỉ số tương ứng.
     * * Complexity:
     * - Time: O(n^2) -> Có thể tối ưu bằng HashMap để đạt O(n).
     * - Space: O(1) -> Nếu dùng HashMap sẽ tăng lên O(n).
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
// @lc code=end
