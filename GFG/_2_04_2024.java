package POTD.GFG;

public class _2_04_2024 {



//User function Template for Java

    class Node {
        int data;
        Node left;
        Node right;

        public Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    class Solution

    {          //Java Solution

        int min=Integer.MAX_VALUE;

        Node p=null;

        int absolute_diff(Node root)

        {

            //Your code here

            fun(root);

            return min;

        }

        void fun(Node root){

            if(root==null) return;

            fun(root.left);

            if(p!=null){

                min=Math.min(min,root.data-p.data);

            }

            p=root;

            fun(root.right);

        }

    }

}
