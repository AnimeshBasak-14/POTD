package POTD.GFG;

public class _16_03_2024 {
    class Solution
    {
        void deleteNode(Node del_node)
        {
            if(del_node == null) // If linked list is empty
                return;
            else{
                if(del_node.next == null){
                    // System.out.println("This is last node, require head, can't be freed\n");
                    return;
                }
            }
            // copy data of the next node to current node
            del_node.data = del_node.next.data;

            // perform conventional deletion
            del_node.next = del_node.next.next;
        }

    }
}

