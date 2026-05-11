/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 *
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 *
 * algorithms
 * Easy (62.73%)
 * Likes:    19231
 * Dislikes: 20546
 * Total Accepted:    7.8M
 * Total Submissions: 12.5M
 * Testcase Example:  '[1,1,2]'
 *
 * Given an integer array nums sorted in non-decreasing order, remove the
 * duplicates in-place such that each unique element appears only once. The
 * relative order of the elements should be kept the same.
 * 
 * Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After
 * removing duplicates, return the number of unique elements k.
 * 
 * The first k elements of nums should contain the unique numbers in sorted
 * order. The remaining elements beyond index k - 1 can be ignored.
 * 
 * Custom Judge:
 * 
 * The judge will test your solution with the following code:
 * 
 * 
 * int[] nums = [...]; // Input array
 * int[] expectedNums = [...]; // The expected answer with correct length
 * 
 * int k = removeDuplicates(nums); // Calls your implementation
 * 
 * assert k == expectedNums.length;
 * for (int i = 0; i < k; i++) {
 * ⁠   assert nums[i] == expectedNums[i];
 * }
 * 
 * 
 * If all assertions pass, then your solution will be accepted.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements
 * of nums being 1 and 2 respectively.
 * It does not matter what you leave beyond the returned k (hence they are
 * underscores).
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements
 * of nums being 0, 1, 2, 3, and 4 respectively.
 * It does not matter what you leave beyond the returned k (hence they are
 * underscores).
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 3 * 10^4
 * -100 <= nums[i] <= 100
 * nums is sorted in non-decreasing order.
 * 
 * 
 */

// @lc code=start
class Solution {
    /**
     * Problem: 26. Remove Duplicates from Sorted Array
     * Difficulty: Easy
     * THOUGHT PROCESS:
     * - Cách tiếp cận: Vì mãng đã được sắp xếp, nên ta mặc định giá trị đầu tiên
     * unique và các số trùng nhau đã nằm cạnh nhau. 
     * + Ta sẽ bắt đầu so sánh từ vị trí thứ 2.
     * + Sử dụng 2 con trỏ.
     * + Con trỏ i cho vị trí của phần từ duy nhất (unique).
     * + Con trỏ j dùng để duyệt mảng. (Bắt đầu từ vị trí thứ 2).
     * + Khi nums[j] khác với nums[i], ta biết số đó là số mới, đưa nó lên vị trí tiếp
     * theo (i+1).
     * COMPLEXITY:
     * - Time Complexity: O(n) - Duyệt qua mảng 1 lần duy nhất.
     * - Space Complexity: O(1) - Không tốn thêm bộ nhớ cho mảng phụ. 
     **/
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
// @lc code=end
