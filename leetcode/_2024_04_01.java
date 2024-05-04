package POTD.leetcode;

public class _2024_04_01 {
    class Solution {
        public int lengthOfLastWord(String s) {
            int ans=0;
            char gap=' ';
            for(int i=s.length()-1;i>=0;i--){
                if(s.charAt(i)==gap && ans==0){
                    continue;
                }else if(s.charAt(i)!=gap){
                    ans++;
                }else{
                    break;
                }
            }return ans;
        }
    }
}
