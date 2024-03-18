package POTD.GFG;

import java.util.*;


public class _18_March_2024 {


    class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }

    class Solution
    {
        //Function to return the level order traversal of a tree.
        static ArrayList<Integer> levelOrder(Node root)
        {
            ArrayList<Integer> result = new ArrayList<>();
            if (root == null)
                return result;

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                Node tempNode = queue.poll();
                result.add(tempNode.data);

                if (tempNode.left != null)
                    queue.add(tempNode.left);

                if (tempNode.right != null)
                    queue.add(tempNode.right);
            }
            return result;
        }
    }
}

