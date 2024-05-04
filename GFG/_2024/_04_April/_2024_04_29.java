package POTD.GFG._2024._04_April;

public class _2024_04_29 {
    /* Link list Node */
class Node
{
	Node next;
	int data;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
    class Solution
    {
        /*You are required to complete this method*/
        Node delete(Node head, int k)
        {
            // Your code here
            if (k == 1) return null;
            int ct = 1;
            Node node = head;
            while (node != null) {
                if (ct == k-1) {
                    if (node.next == null) break;
                    node.next = node.next.next;
                    // node = node.next;
                    ct = 1;
                } else {
                    ct++;
                }
                node = node.next;
            }
            return head;
        }
    }
}
