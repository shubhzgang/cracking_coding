/**
 * Replace space with %20 in place in the char array.
 */
public class URLify {
    public static void main(String[] args) {
        URLify sol = new URLify();
        String s = "Mr John Smith    ";
        String s2 = "      ";
        char[] chars = s.toCharArray();
        char[] chars2 = s2.toCharArray();
        sol.replace(chars, 13);
        sol.replace(chars2, 2);
        System.out.println(chars);
        System.out.println(chars2);
    }
    private void replace(char[] chars, int size) {
        int curr = size - 1;
        int last = chars.length - 1;
        for (; curr >= 0; curr--) {
            if (chars[curr] != ' ') {
                chars[last--] = chars[curr];
            } else {
                chars[last--] = '0';
                chars[last--] = '2';
                chars[last--] = '%';
            }
        }
    }
}
