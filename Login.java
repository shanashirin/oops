import java.util.Scanner;
class AuthException extends Exception {    
    public AuthException(String message) {
        super(message);
    }
}
public class Login {
    public static void authenticate(String username, String password) throws AuthException {
        String user = "admin";  
        String pass = "1234";          
        if (!username.equals(user) || !password.equals(pass)) {           
            throw new AuthException("Invalid login attempt. Welcome, " + username + "!");
        } else {
            System.out.println("Authentication successful! Welcome, " + username + "!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        System.out.print("Enter username: ");
        String user = sc.nextLine();       
        System.out.print("Enter password: ");
        String pass = sc.nextLine();
        try {
            authenticate(user, pass);
        } catch (AuthException e) {
            System.out.println("Authentication failed: " + e.getMessage());
        }
        sc.close();
    }
}

