//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
//
// 你可以按任意顺序返回答案。
//
//
//
// 示例 1：
//
//
//输入：nums = [2,7,11,15], target = 9
//输出：[0,1]
//解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
//
//
// 示例 2：
//
//
//输入：nums = [3,2,4], target = 6
//输出：[1,2]
//
//
// 示例 3：
//
//
//输入：nums = [3,3], target = 6
//输出：[0,1]
//
//
//
//
// 提示：
//
//
// 2 <= nums.length <= 104
// -109 <= nums[i] <= 109
// -109 <= target <= 109
// 只会存在一个有效答案
//
//
// 进阶：你可以想出一个时间复杂度小于 O(n2) 的算法吗？
// Related Topics 数组 哈希表
// 👍 11807 👎 0


package com.colinxu.leetcode.editor.cn;

import java.util.Arrays;

public class Q1TwoSum {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int slow = 0, fast = 1;
            while (slow <= nums.length) {
                if (nums[slow] + nums[fast] == target) {
                    break;
                }
                if (fast == nums.length - 1) {
                    slow++;
                    fast = slow + 1;
                } else {
                    fast++;
                }
            }
            return new int[]{slow, fast};
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


    public static void main(String[] args) {
        Solution solution = new Q1TwoSum().new Solution();
        int[] input = {-3,4,3,90};
        int[] result = solution.twoSum(input, 0);
        System.out.println(Arrays.toString(result));
    }
}
