package POTD.GFG;

import java.util.ArrayList;

public class _2024_05_03 {

//User function Template for Java


class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}


    class Tree
    {
        public void trave(ArrayList<Integer> list, Node root, int k) {
            if (k == 0 || root == null) {
                if (root != null && k == 0) {
                    list.add(root.data);
                }
                return;
            }
            trave(list, root.left, k-1);
            trave(list, root.right, k-1);
        }
        // Recursive function to print right view of a binary tree.
        ArrayList<Integer> Kdistance(Node root, int k)
        {
            ArrayList<Integer> list = new ArrayList<>();
            trave(list, root, k);
            return list;
            // Your code here
        }
    }

}
