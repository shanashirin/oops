import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        System.out.println("\nString Manipulations:"); 
        System.out.println("Original String: " + input); 
        System.out.println("Length of the string: " + input.length()); 
        System.out.println("String in uppercase: " + input.toUpperCase());
        System.out.println("String in lowercase: " + input.toLowerCase());
        System.out.println("\nEnter another string to concatenate:"); 
        String string2 = sc.nextLine();
        System.out.println("Concatenated string: " + input.concat(" " + string2)); 
        
        if (input.length() > 3) {
            System.out.println("Substring (first 3 characters): " + input.substring(0, 3));
        } else {
            System.out.println("Substring (full string): " + input);
        } 
        System.out.println("\nEnter a character to replace: ");
        char oldchar = sc.next().charAt(0);
        System.out.println("Enter a new character: ");
        char newchar = sc.next().charAt(0);
        System.out.println("String after replacement: " + input.replace(oldchar, newchar));
        
        System.out.println("Enter a word to check if it is in the string:");
        sc.nextLine(); // To consume the leftover newline
        String word = sc.nextLine();
        if (input.contains(word)) {
            System.out.println("Yes, the string contains '" + word + "'.");
        } else {
            System.out.println("No, the string does not contain '" + word + "'.");
        }  
        
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string: " + reversed);
    }
}

