package POTD.GFG;

public class _4_04_2024 {
    //User function Template for Java

    class Solution
    {
        //Function to find sum of all possible substrings of the given string.
        public static long sumSubstrings(String s)
        {
            final int MOD = 1000000007;
            long result = 0;
            long multiplier = 1;

            for (int i = s.length() - 1; i >= 0; i--) {
                result = (result + (s.charAt(i) - '0') * multiplier * (i + 1)) % MOD;
                multiplier = (multiplier * 10 + 1) % MOD;
            }

            return (int) result;


        }
    }



}
