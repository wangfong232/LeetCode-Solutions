/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 *
 * https://leetcode.com/problems/contains-duplicate/description/
 *
 * algorithms
 * Easy (64.31%)
 * Likes:    13999
 * Dislikes: 1372
 * Total Accepted:    6.4M
 * Total Submissions: 10M
 * Testcase Example:  '[1,2,3,1]'
 *
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [1,2,3,1]
 * 
 * Output: true
 * 
 * Explanation:
 * 
 * The element 1 occurs at the indices 0 and 3.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [1,2,3,4]
 * 
 * Output: false
 * 
 * Explanation:
 * 
 * All elements are distinct.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * 
 * Output: true
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 * 
 * 
 */

// @lc code=start

import java.util.Arrays;
import java.util.HashSet;

class Solution {

    /*
     * Cách 1: Tối ưu về thời gian
     * Problem: 217. Contains Duplicate
     * Difficulty: Easy
     * THOUGHT PROCESS:
     * - Sử dụng HashSet để lưu các phần tử đã duyệt qua.
     * - Với mỗi phần tử, kiểm tra xem nó đã tồn tại trong Set chưa.
     * - Nếu đã tồn tại -> Trả về true (có trùng lặp)
     * - Nếu chưa tồn tại -> Thêm vào Set và tiếp tục.
     * 
     * COMPLEXITY:
     * - Time Complexity: O(n) - Duyệt qua mảng
     * - Space Copmlexity: O(n) - Trong TH xấu nhất, Set sẽ lưu trữ toàn bộ n phần
     * tử của mảng.
     **/
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Cách 2: Tối ưu về không gian:
     * Time: O(n log n) | Space: O(1)
    
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                return true;
        }
        return false;
    }
    */
}
// @lc code=end
