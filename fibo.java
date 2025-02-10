import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();

        int first = 0, second = 1, next;
        
   
        System.out.print("Fibonacci series: " + first + " " + second);


        for (int i = 2; i < n; i++) {
            next = first + second;
            System.out.print(" " + next);  
            first=second;
            second = next;
        }
        System.out.println();  
    }
}

