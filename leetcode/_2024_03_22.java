package POTD.leetcode;

public class _2024_03_22 {

//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    class Solution {
        public boolean isPalindrome(ListNode head) {
            // Base case
            if (head == null || head.next == null) {
                return true;
            }

            // Find middle
            ListNode mid = findMidNode(head);

            // Reverse 2nd half
            ListNode curr = mid.next;
            ListNode prev = null;
            while (curr != null) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            ListNode right = prev;
            ListNode left = head;

            // Check if equal
            while (right != null && left != null) {
                if (left.val != right.val) {
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }

        private ListNode findMidNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head.next;
            //important because we want final mid to be end of 1st half in even case,
            //not start of 2nd half. Because mid.next is start of 2nd half.

            while(fast!= null && fast.next!=null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }
}
