package day0;

public class MinMaxInArray {

    public static void main(String[] args) {
        int[] numbers = {23, 45, 67, 12, 89, 34, 56, 11, 90};

        // Initialize min and max with the first element
        
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}
