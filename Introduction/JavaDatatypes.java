import java.util.*;
import java.io.*;

class Solution {
    public static void main(String []argh) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            String s = sc.next();   // read as string first

            try {
                long x = Long.parseLong(s);

                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127)
                    System.out.println("* byte");
                if (x >= -32768 && x <= 32767)
                    System.out.println("* short");
                if (x >= -2147483648L && x <= 2147483647L)
                    System.out.println("* int");
                System.out.println("* long");

            } catch (Exception e) {
                System.out.println(s + " can't be fitted anywhere.");
            }
        }
    }
}
