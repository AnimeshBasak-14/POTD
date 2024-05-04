package POTD.leetcode._2024._05_May;

import java.util.ArrayList;

public class _2024_05_01 {

    class Solution {
        public String reversePrefix(String word, char ch) {
            int firstOccurence = word.indexOf(ch);
            if(firstOccurence == -1){
                return word;
            }

            StringBuilder prefix = new StringBuilder(word.substring(0, firstOccurence+1));
            return prefix.reverse().toString() + word.substring(firstOccurence+1);
        }
    }
}
