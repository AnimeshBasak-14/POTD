package POTD.leetcode;

public class _27_March_2024 {
    class Solution {
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            if (k <= 1) return 0;
            int count = 0, product = 1;
            int left = 0;

            for (int right = 0; right < nums.length; right++) {
                product *= nums[right];
                while (product >= k) {
                    product /= nums[left];
                    left++;
                }
                count += right - left + 1;
            }
            return count;
        }
    }

}
