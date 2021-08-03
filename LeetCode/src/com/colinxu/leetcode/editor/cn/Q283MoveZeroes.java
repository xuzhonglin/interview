//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//
// 示例:
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0]
//
// 说明:
//
//
// 必须在原数组上操作，不能拷贝额外的数组。
// 尽量减少操作次数。
//
// Related Topics 数组 双指针
// 👍 1153 👎 0


package com.colinxu.leetcode.editor.cn;

import java.util.Arrays;

public class Q283MoveZeroes {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void moveZeroes(int[] nums) {
            int slow = 0;
            for (int fast = 1; fast < nums.length; fast++) {
                if (nums[slow] == 0 && nums[fast] != 0) {
                    nums[slow] = nums[fast];
                    nums[fast] = 0;
                }
                if (nums[slow] != 0) {
                    slow++;
                }
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


    public static void main(String[] args) {
        Solution solution = new Q283MoveZeroes().new Solution();
        int[] input = new int[]{0,1,0,3,12};
        System.out.println("input:\t" + Arrays.toString(input));
        solution.moveZeroes(input);
        System.out.println("output:\t" + Arrays.toString(input));
    }
}
