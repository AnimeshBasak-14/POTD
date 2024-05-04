package POTD.GFG._2024._04_April;

public class _2024_04_30 {


/* node for linked list */

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}



    class Solution{
        //Function to add two numbers represented by linked list.
        static void printList(Node head){
            Node curr = head;

            while(curr != null){
                System.out.print(curr.data + " -> ");
                curr = curr.next;
            }

            System.out.println();
        }

        Node reverseList(Node head){
            if(head == null){
                return null;
            }

            Node dummy = new Node(0);
            dummy.next = head;
            Node prev = dummy;
            Node curr = head;
            Node next = head;
            if(head != null){
                next = next.next;
            }

            while(curr != null){
                curr.next = prev;
                prev = curr;
                curr = next;
                if(next != null){
                    next = next.next;
                }
            }

            head.next = null;
            return prev;
        }

        Node addTwoLists(Node num1, Node num2){
            Node curr1 = num1;
            Node curr2 = num2;

            while(curr1 != null && curr1.data == 0){
                curr1 = curr1.next;
            }

            while(curr2 != null && curr2.data == 0){
                curr2 = curr2.next;
            }

            if(curr1 == null && curr2 == null){
                return new Node(0);
            }

            curr1 = reverseList(curr1);
            curr2 = reverseList(curr2);

            int carry = 0, size1 = 0, size2 = 0;

            Node temp1 = curr1;
            Node temp2 = curr2;

            while(temp1 != null){
                size1 += 1;
                temp1 = temp1.next;
            }

            while(temp2 != null){
                size2 += 1;
                temp2 = temp2.next;
            }

            if(size1 < size2){
                Node temp = curr1;
                curr1 = curr2;
                curr2 = temp;

                int tempSize = size1;
                size1 = size2;
                size2 = tempSize;
            }

            temp1 = curr1;
            temp2 = curr2;

            while(size1 > 0){
                int sum = carry;

                if(temp1 != null){
                    sum += temp1.data;
                }

                if(temp2 != null){
                    sum += temp2.data;
                }

                temp1.data = (sum % 10);
                carry = sum / 10;

                size1 -= 1;
                if(temp2 != null){
                    temp2 = temp2.next;
                }

                if(size1 > 0){
                    temp1 = temp1.next;
                }
            }

            if(carry != 0){
                Node additionalNode = new Node(carry);
                temp1.next = additionalNode;
            }

            curr1 = reverseList(curr1);

            return curr1;
        }
    }
}
