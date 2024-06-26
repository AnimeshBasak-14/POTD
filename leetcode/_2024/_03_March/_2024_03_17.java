package POTD.leetcode._2024._03_March;

import java.util.*;

public class _2024_03_17 {
    class Solution {
        public int[][] insert(int[][] intervals, int[] newInterval) {
            List<int[]> result = new ArrayList<>();

            // Iterate through intervals and add non-overlapping intervals before newInterval
            int i = 0;
            while (i < intervals.length && intervals[i][1] < newInterval[0]) {
                result.add(intervals[i]);
                i++;
            }

            // Merge overlapping intervals
            while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
                i++;
            }

            // Add merged newInterval
            result.add(newInterval);

            // Add non-overlapping intervals after newInterval
            while (i < intervals.length) {
                result.add(intervals[i]);
                i++;
            }

            return result.toArray(new int[result.size()][]);
        }
    }

}
