import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Scanner;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<String, String> table = new Hashtable<>();
        table.put("101", "Alice");
        table.put("102", "Bob");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter key to search: ");
        String key = scanner.nextLine();
        if (table.containsKey(key)) {
            System.out.println("Value: " + table.get(key));
        } else {
            System.out.println("Key not found.");
        }

        Enumeration<String> keys = table.keys();
        System.out.println("All keys:");
        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
        }
        scanner.close();
    }
}
