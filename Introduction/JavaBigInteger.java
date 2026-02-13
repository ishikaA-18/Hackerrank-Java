import java.io.*;
import java.util.*;
import java.math.*;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        BigInteger num1=new BigInteger(a);
        BigInteger num2=new BigInteger(b);
        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));
    }
}
