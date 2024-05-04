package POTD.GFG._2024._05_May;

import java.util.*;

public class _2024_05_01 {


//    Structure of node class is:
    class Node {
        char data;
        Node next;

        public Node(char data){
            this.data = data;
            next = null;
        }
    }

    class Solution {

        public boolean isVowel(char ch){
            return ((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u'));
        }

        public Node arrangeCV(Node head){

            Node constDummy = new Node('#');
            Node vowelDummy = new Node('#');

            Node constTail = constDummy;
            Node vowelTail = vowelDummy;

            Node curr=  head;
            while(curr!=null){
                if(!isVowel(curr.data)){
                    constTail.next = new Node(curr.data);
                    constTail = constTail.next;
                }
                else{
                    vowelTail.next = new Node(curr.data);
                    vowelTail = vowelTail.next;
                }
                curr = curr.next;
            }

            vowelTail.next = constDummy.next;

            Node ansHead = vowelDummy.next;
            return ansHead;

        }
    }
}
