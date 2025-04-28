import java.io.*;

public class EvenOddFile {
    public static void main(String[] args) {
        try (
            BufferedReader in = new BufferedReader(new FileReader("integers.txt"));
            FileWriter evenWriter = new FileWriter("even.txt");
            FileWriter oddWriter = new FileWriter("odd.txt")
        ) {
            String line;
            while ((line = in.readLine()) != null) {
                int num = Integer.parseInt(line);
                (num % 2 == 0 ? evenWriter : oddWriter).write(num + "\n");
            }
            System.out.println("Even and odd numbers copied successfully!");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

