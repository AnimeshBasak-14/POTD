package POTD.GFG._2024._03_March;

import java.util.Stack;

public class _2024_03_24 {
    class Solution {
        public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
            Stack<Integer>s=new Stack<>();
            while(!st.isEmpty()){
                s.push(st.pop());
            }
            st.push(x);
            while(!s.isEmpty()){
                st.push(s.pop());
            }
            return st;

        }
    }
}
