import java.util.Scanner;
class NegativeException extends Exception {
    public NegativeException(String message) {
        super(message);
    }
}
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count, sum = 0, validInputs = 0;
        System.out.print("Enter the number of integers: ");
        count = sc.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            try {
                if (num < 0) {
                    throw new NegativeException("Negative input not allowed: " + num);
                }
                sum += num;
                validInputs++;
            } catch (NegativeException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        if (validInputs > 0) {
            double average = (double) sum / validInputs;
            System.out.println("Average of valid inputs: " + average);
        } else {
            System.out.println("No valid positive numbers entered.");
        }

        sc.close();
    }
}

