package POTD.GFG._2024._05_May;
import java.util.*;

public class _2024_05_02 {

//Complete the given function
//Node is as follows:
class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

    class Tree {
        // Function to serialize a tree and return a list containing nodes of tree.
        ArrayList<Integer> al;
        public ArrayList<Integer> serialize(Node root) {
            // code here
            al = new  ArrayList<Integer>();
            fun(root);
            return al;
        }
        void fun(Node root){
            if(root==null){
                al.add(-1);
                return;
            }
            al.add(root.data);
            fun(root.left);
            fun(root.right);
        }

        // Function to deserialize a list and construct the tree.
        int index;
        public Node deSerialize(ArrayList<Integer> A) {
            // code here
            index=0;
            return dfs(A);
        }
        Node dfs(ArrayList<Integer> A){
            if(index==A.size()) return null;

            int val = A.get(index);
            index++;

            if(val==-1) return null;

            Node root = new Node(val);
            root.left = dfs(A);
            root.right = dfs(A);

            return root;

        }
    };
}
