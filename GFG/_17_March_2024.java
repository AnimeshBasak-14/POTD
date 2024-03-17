package POTD.GFG;

import java.util.HashSet;
import java.util.LinkedList;

public class _17_March_2024 {
    /*
class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

    class Solution {

        public static int countPairs(
                LinkedList<Integer> head1, LinkedList<Integer> head2, int x) {

            HashSet<Integer> set = new HashSet<>();
            int count = 0;

            // Traverse head1 and store elements in the set
            for (Integer num : head1) {
                set.add(num);
            }

            // Traverse head2 and check for complement in the set
            for (Integer num : head2) {
                int complement = x - num;
                if (set.contains(complement)) {
                    count++;
                }
            }

            return count;

        }
    }

}
