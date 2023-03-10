import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Algo to check if a string is a permutation of the other.
 */
public class IsPermutation {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"isperm", "mrepis"},
                {"notperm", "permont"},
                {"notpermm", "permont"}};
        IsPermutation sol = new IsPermutation();
        for (String[] strings : arr) {
            System.out.printf("%s and %s are permutations: " + sol.isPermutation(strings[0], strings[1]) + "%n", strings[0], strings[1]);
        }
    }

    private boolean isPermutation(String s1, String s2) {
        Map<Character, Integer> charCountMap1 = new HashMap<>();
        Map<Character, Integer> charCountMap2 = new HashMap<>();
        for (char c : s1.toCharArray()) {
            if (!charCountMap1.containsKey(c)) {
                charCountMap1.put(c, 1);
            } else {
                charCountMap1.put(c, charCountMap1.get(c) + 1);
            }
        }
        for (char c : s2.toCharArray()) {
            if (!charCountMap2.containsKey(c)) {
                charCountMap2.put(c, 1);
            } else {
                charCountMap2.put(c, charCountMap2.get(c) + 1);
            }
        }
        if (charCountMap1.size() != charCountMap2.size()) {
            return false;
        }
        return charCountMap1.entrySet().stream()
                .allMatch(ciEntry -> ciEntry.getValue().equals(charCountMap2.get(ciEntry.getKey())));
    }

}
