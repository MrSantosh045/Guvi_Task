package Guvi_TasK_11;

public class Q_5_ArrayIndexOutOfBoundsException 

 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // Trying to access an element outside the bounds of the array
            int value = numbers[5];  // Index 5 is out of bounds (valid indices are 0 to 4)
            System.out.println("Value at index 5: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Array index is out of bounds.");
        }
    }
}