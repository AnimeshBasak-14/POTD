package POTD.leetcode;
import java.util.Arrays;
public class _15_March_2024 {
        public static int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int ans[] = new int[n];
            Arrays.fill(ans, 1);
            int curr = 1;
            for(int i = 0; i < n; i++) {
                ans[i] *= curr;
                curr *= nums[i];
            }
            curr = 1;
            for(int i = n - 1; i >= 0; i--) {
                ans[i] *= curr;
                curr *= nums[i];
            }
            return ans;
        }

        public static void main(String[] args) {
            int[] nums = {1,2,3,4};
            System.out.println(Arrays.toString(productExceptSelf(nums)));
        }
    }

