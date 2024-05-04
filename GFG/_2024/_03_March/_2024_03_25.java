package POTD.GFG._2024._03_March;

import java.util.ArrayList;

public class _2024_03_25 {

//User function Template for Java

    class Solution {
        ArrayList<String> NBitBinary(int N) {
            ArrayList<String> r = new ArrayList<String>();
            int first = 1 << (N - 1);
            int last = first * 2;

            // generate numbers in the range of (2^N)-1 to 2^(N-1)
            // inclusive
            for (int i = last - 1; i >= first; --i)
            {
                int zero_cnt = 0;
                int one_cnt = 0;
                int t = i;
                int num_of_bits = 0;

                // longest prefix check
                while (t > 0)
                {
                    if ((t & 1) != 0)
                        one_cnt++;
                    else
                        zero_cnt++;
                    num_of_bits++;
                    t = t >> 1;
                }

                // if counts of 1 is greater than
                // counts of zero
                if (one_cnt >= zero_cnt)
                {
                    // do sub-prefixes check
                    boolean all_prefix_match = true;
                    int msk = (1 << num_of_bits) - 2;
                    int prefix_shift = 1;
                    while (msk > 0)
                    {

                        int prefix = (msk & i) >> prefix_shift;
                        int prefix_one_cnt = 0;
                        int prefix_zero_cnt = 0;
                        while (prefix > 0)
                        {
                            if ((prefix & 1)!=0)
                                prefix_one_cnt++;
                            else
                                prefix_zero_cnt++;
                            prefix = prefix >> 1;
                        }
                        if (prefix_zero_cnt > prefix_one_cnt)
                        {
                            all_prefix_match = false;
                            break;
                        }
                        prefix_shift++;
                        msk = msk & (msk << 1);
                    }
                    if (all_prefix_match)
                    {
                        r.add(getBinaryRep(i, num_of_bits));
                    }
                }
            }
            return r;
        }
        static String getBinaryRep(int N, int num_of_bits)
        {
            String r = "";
            num_of_bits--;

            // loop for each bit
            while (num_of_bits >= 0)
            {
                if ((N & (1 << num_of_bits))!=0)
                    r += "1";
                else
                    r += "0";
                num_of_bits--;
            }
            return r;
        }
    }

}
