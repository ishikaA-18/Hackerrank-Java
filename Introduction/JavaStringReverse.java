import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String s1="";
        for(int i=A.length()-1;i>=0;i--){
            s1=s1+A.charAt(i);
        }
         if (A.equals(s1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
            /* Enter your code here. Print output to STDOUT. */
        
    }
}
