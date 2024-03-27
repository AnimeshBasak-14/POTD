package POTD.GFG;

import java.util.Stack;

public class _24_March_2024 {
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
