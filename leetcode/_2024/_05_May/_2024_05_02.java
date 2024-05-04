package POTD.leetcode._2024._05_May;

import java.util.*;

public class _2024_05_02 {

    class Solution {
        public int findMaxK(int[] nums) {
            Arrays.sort(nums);
            int left = 0, right = nums.length - 1;
            int maxK = Integer.MIN_VALUE;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == 0) {
                    maxK = Math.max(maxK, nums[right]);
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
            return maxK != Integer.MIN_VALUE ? maxK : -1;  // If no such pair found
        }
    }

}
