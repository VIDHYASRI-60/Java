package demo;

public class FirstNonRepeated {
    public static void main(String[] args) {

        String str = "aabbcde";

        int[] freq = new int[256];

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // Find first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (freq[ch] == 1) {
                System.out.println("First Non-Repeating Character: " + ch);
                break;
            }
        }
    }

}
