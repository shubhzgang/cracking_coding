import java.util.HashSet;
import java.util.Set;

/**
 * Algo to determine if a string has all unique chars.
 */
public class IsUnique {
    public static void main(String[] args) {
        String[] strings = new String[]{"unique", "notunique", "uniqe"};
        IsUnique solution = new IsUnique();
        for (String string : strings) {
            System.out.println(string + " With extra mem: " + solution.isUnique(string));
            System.out.println(string + " Without extra mem: " + solution.isUniqueWithoutMem(string));
        }
    }

    private boolean isUnique(String s) {
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!charSet.add(c)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Without using extra memory.
     * @param s the input string
     */
    private boolean isUniqueWithoutMem(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    return false;
            }
        }
        return true;
    }

}
