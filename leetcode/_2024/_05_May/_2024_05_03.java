package POTD.leetcode._2024._05_May;

public class _2024_05_03 {
    class Solution {
        public int compareVersion(String version1, String version2) {
            int n = version1.length(), m = version2.length();
            int i = 0, j = 0;
            while (i < n || j < m) {
                int x = 0;
                for (; i < n && version1.charAt(i) != '.'; ++i) {
                    x = x * 10 + version1.charAt(i) - '0';
                }
                ++i; // 跳过点号
                int y = 0;
                for (; j < m && version2.charAt(j) != '.'; ++j) {
                    y = y * 10 + version2.charAt(j) - '0';
                }
                ++j; // 跳过点号
                if (x != y) {
                    return x > y ? 1 : -1;
                }
            }
            return 0;
        }
    }
}