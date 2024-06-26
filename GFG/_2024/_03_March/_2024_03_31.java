package POTD.GFG._2024._03_March;

public class _2024_03_31 {

// User function Template for Java

    class Node
    {
        int key;
        Node left, right;

        Node(int x)
        {
            key = x;
            left = right = null;
        }

    }
    class Solution {
        public static int findMaxForN(Node root, int n) {
            int max = -1;
            while(root != null) {
                if(root.key <= n && root.key > max)
                    max = root.key;
                if(root.key < n) {
                    root = root.right;
                }
                else {
                    root = root.left;
                }
            }

            return max;
        }
    }
}
