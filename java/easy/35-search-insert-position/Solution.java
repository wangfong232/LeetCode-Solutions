/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 *
 * https://leetcode.com/problems/search-insert-position/description/
 *
 * algorithms
 * Easy (51.19%)
 * Likes:    18877
 * Dislikes: 903
 * Total Accepted:    4.7M
 * Total Submissions: 9.3M
 * Testcase Example:  '[1,3,5,6]\n5'
 *
 * Given a sorted array of distinct integers and a target value, return the
 * index if the target is found. If not, return the index where it would be if
 * it were inserted in order.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 10^4
 * -10^4 <= nums[i] <= 10^4
 * nums contains distinct values sorted in ascending order.
 * -10^4 <= target <= 10^4
 * 
 * 
 */

// @lc code=start
class Solution {
    /**
     * Problem: 35. Search Insert Position
     * Difficulty: Easy
     * THOUGHT PROCESS:
     * - Mảng đã sắp xếp và yêu cầu O(log n) -> Sử dụng Binary Search
     * - Nếu tìm thấy target, trả về chỉ số mid ngay lập tức.
     * - Nếu không tìm thấy, sau khi vòng lặp kết thúc, con trỏ 'left' sẽ dừng lại 
     * đúng tại vị trí mà target nên được chèn vào để duy trì thứ tự sắp xếp. 
     * COMPLEXITY:
     * - Time Complexity: O(log n) - Chia đôi phạm vi tìm kiếm sau mỗi bước. 
     * - Space Complexity: O(1) 
     **/
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
// @lc code=end
