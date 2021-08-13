//给你两个字符串 s1 和 s2 ，写一个函数来判断 s2 是否包含 s1 的排列。
//
// 换句话说，s1 的排列之一是 s2 的 子串 。
//
//
//
// 示例 1：
//
//
//输入：s1 = "ab" s2 = "eidbaooo"
//输出：true
//解释：s2 包含 s1 的排列之一 ("ba").
//
//
// 示例 2：
//
//
//输入：s1= "ab" s2 = "eidboaoo"
//输出：false
//
//
//
//
// 提示：
//
//
// 1 <= s1.length, s2.length <= 104
// s1 和 s2 仅包含小写字母
//
// Related Topics 哈希表 双指针 字符串 滑动窗口
// 👍 396 👎 0


package com.colinxu.leetcode.editor.cn;

import java.util.HashMap;
import java.util.HashSet;

public class Q567PermutationInString {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            HashSet<Character> s1Set = new HashSet<>();
            for (int i = 0; i < s1.length(); i++) {
                s1Set.add(s1.charAt(i));
            }
            int match = 0;
            for (int i = 0; i < s2.length(); i++) {
                Character temp = s2.charAt(i);
                if (s1Set.contains(temp)) {
                    match++;
                }else{
                    match=0;
                }
            }

            return false;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


    public static void main(String[] args) {
        Solution solution = new Q567PermutationInString().new Solution();
        String s1 = "hello";
        String s2 = "ooolleoooleh";
        boolean b = solution.checkInclusion(s1, s2);
        System.out.println(b);
        //TODO coding here
    }
}
