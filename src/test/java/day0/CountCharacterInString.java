package day0;

public class CountCharacterInString {

    public static void main(String[] args) {
        String str = "Hello World"; // Example string
        int count = 0;

        int l=str.length();
        System.out.println(l);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') { // Check for non-space characters
                count++;
            }       
            System.out.println("Number of characters (excluding spaces): " + count);
		}
	}
}
