package POTD.leetcode._2024._04_April;

public class _2024_04_04 {
    class Solution {
        public int maxDepth(String s) {
            int count = 0;
            int maxNum = 0;
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    count++;
                    if (maxNum < count)
                        maxNum = count;
                } else if (c == ')') {
                    count--;
                }
            }
            return maxNum;
        }
    }
}
