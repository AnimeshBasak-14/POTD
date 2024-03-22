package POTD.GFG;

import java.util.Arrays;

public class _23_March_2024 {
    class Solution {
        static int mod = 1000000007;

        int[] Series(int n) {
            // code here
            int[] ans = new int[n+1];
            for (int i = 0; i < n+1; i++){
                ans[i] = fibo(i, ans);
            }
            return ans;
        }

        static int fibo(int n, int[] dp){
            if (n < 2) return n;
            if (dp[n] != 0) return dp[n];
            int ans = (fibo(n-1, dp) + fibo(n-2, dp)) % mod;
            dp[n] = ans;
            return ans;
        }

    }
}
