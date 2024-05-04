package POTD.GFG._2024._03_March;






public class _2024_03_15 {
    class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node sort(Node head){
        head = mergeSortHelper(head);
        return head;
    }

    private Node findMidNode(Node head) {
        Node slow = head;
        Node fast = head.next;
        //important because we want final mid to be end of 1st half in even case,
        //not start of 2nd half. Because mid.next is start of 2nd half.

        while(fast!= null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    private Node mergeSortHelper(Node head) {
        if(head == null || head.next == null) {
            return head;
        }


        Node mid = findMidNode(head);
        //System.out.println(mid.data);
        Node head2 = mid.next;
        mid.next = null;
        Node newHead1 = mergeSortHelper(head);
        Node newHead2 = mergeSortHelper(head2);
        // System.out.println(newHead1.data+" "+newHead2.data);
        Node finalHead = merge(newHead1, newHead2);

        return finalHead;
    }

    private Node merge(Node head1, Node head2) {
        Node finalHead = new Node(-1);
        Node temp = finalHead;

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return finalHead.next;
    }


}
