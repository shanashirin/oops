import java.util.ArrayList;
import java.util.Scanner;
public class StringList {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("mango");
        stringList.add("orange");
        System.out.println("Original List: " + stringList);       
        stringList.add(2, "grapes");
        System.out.println("After adding, the list: " + stringList);       
        stringList.remove("banana");
        System.out.println("After removing: " + stringList);
        System.out.println("Enter a string to search:");
        String search = sc.nextLine();
        if (stringList.contains(search)) {
            System.out.println(search + " found in the list.");
        } else {
            System.out.println(search + " not found in the list.");
        }
        System.out.println("Final list:");
        for (String str : stringList) {
            System.out.println(str);
        }
        sc.close();
    }
}

