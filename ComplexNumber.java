

import java.util.Scanner;

public class ComplexNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter real and imaginary part of the first complex number (separated by space): ");
        double real1 = scanner.nextDouble();
        double imaginary1 = scanner.nextDouble();
        System.out.print("Enter real and imaginary part of the second complex number (separated by space): ");
        double real2 = scanner.nextDouble();
        double imaginary2 = scanner.nextDouble();
        System.out.println("Sum of the complex numbers: " + (real1 + real2) + " + " + (imaginary1 + imaginary2) + "i");

        scanner.close();
    }
}

