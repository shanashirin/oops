import java.io.*;

class FileWriteRead {
    public static void main(String[] args) {
        try {
            String filename = "abc.txt";
            String content = "Once upon a time...";

            // Write to file
            FileWriter fw = new FileWriter(filename);
            fw.write(content);
            fw.close();

            // Read from file
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null)
                System.out.println(line);
            br.close();

        } catch (IOException e) {
            System.out.println("IOException occurred");
        }
    }
}

