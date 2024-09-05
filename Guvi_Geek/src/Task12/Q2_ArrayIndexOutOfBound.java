package Task12;
public class Q2_ArrayIndexOutOfBound {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            // Trying to access an invalid index (index 5 does not exist)
            int number = numbers[5];
            System.out.println("Number at index 5: " + number);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds. " + e.getMessage());
        }
    }
}
