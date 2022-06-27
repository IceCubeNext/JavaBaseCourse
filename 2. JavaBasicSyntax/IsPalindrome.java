public class IsPalindrome {
    /**
     * Checks if given <code>text</code> is a palindrome.
     *
     * @param text any string
     * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
     */
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder reverse_text = new StringBuilder(text);
        return text.equalsIgnoreCase(reverse_text.reverse().toString());
    }
}
