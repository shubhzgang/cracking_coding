/**
 * Check if a string is a permutation of a palindrome.
 */
public class PalindromePerm {

    public static void main(String[] args) {
        String s = "tacocat";
        PalindromePerm sol = new PalindromePerm();
        System.out.println(s + ": " + sol.isPalPerm(s));
    }

    private boolean isPalPerm(String s) {
        char[] chars = s.toCharArray();
        int val;
        int flag = 0;
        for (char c : chars) {
            val = c - 'a';
            flag = flag ^ (1 << val);
        }
        return ((flag - 1) & flag) == 0;
    }

}
