package POTD;


    import java.util.HashMap;

    public class Solution {
        public String minimizeString(String s) {
            int n = s.length();
            HashMap<Character, Integer> count = new HashMap<>();
            StringBuilder result = new StringBuilder();

            for (char c : s.toCharArray()) {
                if (c != '?') {
                    result.append(c);
                    count.put(c, count.getOrDefault(c, 0) + 1);
                } else {
                    char min_char = 'a';
                    int min_cost = Integer.MAX_VALUE;

                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        int cost = count.getOrDefault(ch, 0);
                        if (cost < min_cost) {
                            min_cost = cost;
                            min_char = ch;
                        }
                    }

                    result.append(min_char);
                    count.put(min_char, count.getOrDefault(min_char, 0) + 1);
                }
            }

            return result.toString();
        }

        public static void main(String[] args) {
            Solution solution = new Solution();
            String input = "abcdefghijklmnopqrstuvwxy??";
            String output = solution.minimizeString(input);
            System.out.println(output); // Output: "abcdefghijklmnopqrstuvwxyaz"
        }
    }


