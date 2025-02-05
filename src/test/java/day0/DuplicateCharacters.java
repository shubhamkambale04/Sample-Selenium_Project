package day0;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "Great responsibility";
        char[] chars = str.toCharArray();

        System.out.println("Duplicate characters in the given string:");

        for (int i = 0; i < chars.length; i++) {
            int count = 1;
            if (chars[i] != ' ' && chars[i] != '0') {
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        count++;
                        chars[j] = '0'; // Mark duplicate character
                    }
                }
                if (count > 1)
                    System.out.println(chars[i]);
            }
        }
    }
}
