package POTD.GFG;

public class _20_03_2024 {



//    node class of binary tree
    class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
        }
    }

    class Solution{
        static int maxLen;
        static int maxSum;
        public int sumOfLongRootToLeafPath(Node root)
        {
            // if tree is NULL, then sum is 0
            if (root == null)
                return 0;

            maxSum = Integer.MIN_VALUE;
            maxLen = 0;

            // finding the maximum sum 'maxSum' for the
            // maximum length root to leaf path
            sumOfLongRootToLeafPath(root, 0, 0);

            // required maximum sum
            return maxSum;
        }
        static void sumOfLongRootToLeafPath(Node root, int sum,
                                            int len)
        {
            // if true, then we have traversed a
            // root to leaf path
            if (root == null) {
                // update maximum length and maximum sum
                // according to the given conditions
                if (maxLen < len) {
                    maxLen = len;
                    maxSum = sum;
                } else if (maxLen == len && maxSum < sum)
                    maxSum = sum;
                return;
            }


            // recur for left subtree
            sumOfLongRootToLeafPath(root.left, sum + root.data,len + 1);

            sumOfLongRootToLeafPath(root.right, sum + root.data,len + 1);

        }
    }
}
