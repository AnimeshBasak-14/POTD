package POTD.GFG._2024._05_May;

import java.util.ArrayList;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class _2024_05_06 {
    //User function Template for Java

// A Binary Tree nodea
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


    class Tree
    {
        void noSibling_util(Node node, Set<Integer> h)
        {
            // Base case: check if node is null
            if(node == null)
                return;

            if(node.left != null && node.right != null)
            {
                noSibling_util(node.left,h);
                noSibling_util(node.right,h);
            }

            else if(node.right != null)
            {
                h.add(node.right.data);
                noSibling_util(node.right,h);
            }
            else if(node.left != null)
            {
                h.add(node.left.data);
                noSibling_util(node.left,h);
            }
        }

        ArrayList<Integer> noSibling(Node node)
        {
            // code here
            ArrayList<Integer> ans = new ArrayList<Integer>();
            int flag=0;
            Set<Integer> h = new TreeSet<Integer>();

            noSibling_util(node,h);

            for(int i: h){
                ans.add(i);

                flag=1;
            }

            if(flag==0){
                ans.add(-1);
            }

            // Return the result array
            return ans;
        }
    }
}
