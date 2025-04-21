import java.util.*;

public class Mappro {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add an element");
            System.out.println("2. Update an element");
            System.out.println("3. Remove an element");
            System.out.println("4. Display map");
            System.out.println("5. Exit");

            int ch = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (ch) {
                case 1:
                    System.out.println("Enter the key (integer):");
                    int addKey = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.println("Enter the value (string):");
                    String addValue = sc.nextLine();
                    map.put(addKey, addValue);
                    System.out.println("Element added.");
                    break;

                case 2:
                    System.out.println("Enter the key to update:");
                    int updateKey = sc.nextInt();
                    sc.nextLine();
                    if (map.containsKey(updateKey)) {
                        System.out.println("Enter new value:");
                        String newValue = sc.nextLine();
                        map.put(updateKey, newValue);
                        System.out.println("Element updated.");
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;

                case 3:
                    System.out.println("Enter the key to remove:");
                    int removeKey = sc.nextInt();
                    sc.nextLine();
                    if (map.containsKey(removeKey)) {
                        map.remove(removeKey);
                        System.out.println("Element removed.");
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;

                case 4:
                    System.out.println("Current Map:");
                    for (Map.Entry<Integer, String> entry : map.entrySet()) {
                        System.out.println(entry.getKey() + " => " + entry.getValue());
                    }
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

