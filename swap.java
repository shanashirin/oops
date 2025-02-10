import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        int temp=a;
        a=b;
        b=temp;
        
        System.out.println("After swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
    }
}

