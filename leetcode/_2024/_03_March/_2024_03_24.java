package POTD.leetcode._2024._03_March;

public class _2024_03_24 {
    // class Solution {
//     public int findDuplicate(int[] nums) {


//         // start hopping from Node_#0
//         int slow=0, fast=0;

//         int check = 0;

//         // Step_#1
//         // Cycle detection
//         // Implement Tortoise and Hare algorithm
//         while( true ){
//             slow = nums[slow];
//             fast = nums[ nums[fast] ];

//             if( slow == fast ){
//                 break;
//             }
//         }


//         // Step_#2
//         // Locate the start node of cycle (i.e., the duplicate number)
//         while( true ){
//             slow = nums[slow];
//             check = nums[check];

//             if( slow == check ){
//                 break;
//             }
//         }

//         return check;


//     }
// }

    class Solution {
        public int findDuplicate(int[] nums) {
            boolean[] taken = new boolean[nums.length];
            for (int num : nums) {
                if (taken[num]) {
                    return num;
                }
                taken[num] = true;
            }
            return 0;
        }
    }
}
