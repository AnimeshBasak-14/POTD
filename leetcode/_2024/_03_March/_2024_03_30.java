package POTD.leetcode._2024._03_March;

public class _2024_03_30 {
//    method 1
    // class Solution {
//     public int subarraysWithKDistinct(int[] nums, int k) {
//         int subWithMaxK = subarrayWithAtMostK(nums, k);
//         int reducedSubWithMaxK = subarrayWithAtMostK(nums, k - 1);
//         return subWithMaxK - reducedSubWithMaxK;
//     }

//     public int subarrayWithAtMostK(int[] nums, int k) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int left = 0, right = 0, ans = 0;

//         while (right < nums.length) {
//             map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

//             while (map.size() > k) {
//                 map.put(nums[left], map.get(nums[left]) - 1);
//                 if (map.get(nums[left]) == 0) {
//                     map.remove(nums[left]);
//                 }
//                 left++;
//             }

//             ans += right - left + 1; // Size of subarray
//             right++;
//         }

//         return ans;
//     }
// }

//method 2
    class Solution {
        public int subarraysWithKDistinct(int[] nums, int K) {
            int[] numFreq = new int[nums.length+1];
            int distinct = 0, start = 0, minEnd = 0, total = 0;
            while (distinct == K || minEnd < nums.length) {
                while (distinct < K && minEnd < nums.length)
                    if (numFreq[nums[minEnd++]]++ == 0)
                        distinct++;
                int maxEnd = minEnd;
                while (maxEnd < nums.length && numFreq[nums[maxEnd]] > 0)
                    maxEnd++;
                while (distinct == K) {
                    if (numFreq[nums[start++]]-- == 1)
                        distinct--;
                    total += (maxEnd - minEnd + 1);
                }
            }
            return total;
        }
    }
}
