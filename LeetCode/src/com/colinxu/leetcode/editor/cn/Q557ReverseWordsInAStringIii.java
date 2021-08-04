//给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
//
//
//
// 示例：
//
// 输入："Let's take LeetCode contest"
//输出："s'teL ekat edoCteeL tsetnoc"
//
//
//
//
// 提示：
//
//
// 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
//
// Related Topics 双指针 字符串
// 👍 312 👎 0


package com.colinxu.leetcode.editor.cn;

public class Q557ReverseWordsInAStringIii {

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseWords(String s) {
            String[] words = s.split(" ");
            for (int i = 0; i < words.length; i++) {
                words[i] = reverseWord(words[i]);
            }
            return String.join(" ", words);
        }

        String reverseWord(String s) {
            String[] alphas = s.split("");
            int left = 0, right = alphas.length - 1;
            while (left < right) {
                String temp = alphas[left];
                alphas[left] = alphas[right];
                alphas[right] = temp;
                left++;
                right--;
            }
            return String.join("", alphas);
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


    public static void main(String[] args) {
        Solution solution = new Q557ReverseWordsInAStringIii().new Solution();
        String input = "Let's take LeetCode contest";
        System.out.println("input:\t" + input);
        long start = System.currentTimeMillis();
        String output = solution.reverseWords(input);
        System.out.println("output:\t" + output);
        System.out.println("time:\t" + (System.currentTimeMillis() - start));
    }
}
