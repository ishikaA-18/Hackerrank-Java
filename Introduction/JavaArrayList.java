import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Main list
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Taking input
        for (int i = 0; i < n; i++) {

            int d = sc.nextInt();   // size of inner list
            ArrayList<Integer> inner = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                inner.add(sc.nextInt());
            }

            list.add(inner);
        }

        int q = sc.nextInt();  // number of queries

        for (int i = 0; i < q; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            try {
                System.out.println(list.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}
