package POTD.GFG._2024._03_March;

public class _2024_03_26 {
    class Solution {
        public boolean isAdditiveSequence(String s) {
            // code here
            int n=s.length();
            int num1=0;
            for(int i=0;i<n/2;i++){
                num1=num1*10+(s.charAt(i)-'0');
                int num2=0;
                for(int j=i+1;j<n-1;j++){
                    num2=num2*10+(s.charAt(j)-'0');
                    int p2=num1;int p1=num2;
                    int num=0;int k=j+1;
                    while(k<n){
                        num=num*10+(s.charAt(k)-'0');
                        if(num==(p1+p2)){
                            p2=p1;
                            p1=num;
                            num=0;
                        }
                        k++;
                    }
                    if(k==n&&num==0)return true;
                }
            }
            return false;
        }
    }
}
