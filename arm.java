import java.util.Scanner;

public class arm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        scanner.close();

        int originalNum = num, sum = 0, digits = 0, remainder;
        int temp = num;

    
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = num;

       
        while (temp != 0) {
            remainder = temp % 10;
            sum += Math.pow(remainder, digits);  
            temp /= 10;
        }

   
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number");
        } else {
            System.out.println(originalNum + " is not an Armstrong number");
        }
    }
}

           

