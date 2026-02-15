import java.util.*;
import java.io.*;

class Solution {
    public static void main(String []argh) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        HashMap<String, Integer> phoneBook = new HashMap<>();

        // Store entries
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int phone = sc.nextInt();
            phoneBook.put(name, phone);
            sc.nextLine();
        }

        // Queries
        while (sc.hasNext()) {
            String query = sc.nextLine();

            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }

        sc.close();
    }
}
