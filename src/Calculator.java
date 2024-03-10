import java.util.Scanner;

public class Calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt user to enter the first number
            System.out.print("Enter the first number: ");
            float firstNumberBielecki = scanner.nextFloat();

            // Prompt user to enter the second number
            System.out.print("Enter the second number: ");
            float secondNumberBielecki = scanner.nextFloat();

            // Close the scanner to prevent resource leak
            scanner.close();

            // Calculate sum
            float sum = firstNumberBielecki + secondNumberBielecki;

            // Calculate difference
            float difference = firstNumberBielecki - secondNumberBielecki;

            // Calculate product
            float product = firstNumberBielecki * secondNumberBielecki;

            // Check if the second number is not zero to avoid division by zero
            if (secondNumberBielecki != 0) {
                // Calculate quotient
                float quotient = firstNumberBielecki / secondNumberBielecki;

                // Display the result of all calculations
                System.out.printf("Sum: %.2f\n", sum);
                System.out.printf("Difference: %.2f\n", difference);
                System.out.printf("Product: %.2f\n", product);
                System.out.printf("Quotient: %.2f\n", quotient);
            } else {
                // Display the result of sum, difference, and product only
                System.out.printf("Sum: %.2f\n", sum);
                System.out.printf("Difference: %.2f\n", difference);
                System.out.printf("Product: %.2f\n", product);
                System.out.println("Cannot divide by zero.");
            }
        }



}
