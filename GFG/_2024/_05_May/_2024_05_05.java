package POTD.GFG._2024._05_May;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class _2024_05_05 {

    //Node is as follows:
    class Node{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
    }



    class Solution {
        static class QueueInfo {
            Node node;
            int hd; // Horizontal Distance

            public QueueInfo(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        public ArrayList<Integer> verticalSum(Node root) {
            if (root == null) {
                return new ArrayList<>();
            }

            // Map to store the sum corresponding to horizontal distance
            TreeMap<Integer, Integer> map = new TreeMap<>();
            Queue<QueueInfo> queue = new LinkedList<>();
            queue.add(new QueueInfo(root, 0));

            while (!queue.isEmpty()) {
                QueueInfo curr = queue.poll();

                // Summing up all nodes with the same horizontal distance
                map.put(curr.hd, map.getOrDefault(curr.hd, 0) + curr.node.data);

                // Add left child to queue if it exists
                if (curr.node.left != null) {
                    queue.add(new QueueInfo(curr.node.left, curr.hd - 1));
                }

                // Add right child to queue if it exists
                if (curr.node.right != null) {
                    queue.add(new QueueInfo(curr.node.right, curr.hd + 1));
                }
            }

            // Collecting results from the map into an ArrayList and returning it
            return new ArrayList<>(map.values());
        }

    }


}
