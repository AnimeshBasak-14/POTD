package POTD.leetcode._2024._05_May;

import java.util.Arrays;

public class _2024_05_04 {
    class Solution {
        public int numRescueBoats(int[] people, int limit) {
            int boats = 0;
            Arrays.sort(people);
            int i=0,j=people.length-1;
            while(i<=j){
                if((people[j]+people[i])<=limit){
                    i++;
                }
                j--;
                boats++;
            }
            return boats;
        }
    }
}
