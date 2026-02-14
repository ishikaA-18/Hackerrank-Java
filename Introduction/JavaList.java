import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int q = sc.nextInt();

        while (q-- > 0) {

            String operation = sc.next();   // use next() NOT nextLine()

            if (operation.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            }
            else {  // Delete
                int index = sc.nextInt();
                list.remove(index);
            }
        }

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
