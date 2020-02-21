import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
/*
Algorithm:
1.Since the first and last character of the String palindrome is same we choose two pointers(i,j) one points first index & other points to last index.
2.inside while loop until i<j we add operation with difference of the Math.abs(s.charAt(i)-s.charAt(j));
3.Move i pointer forward and j pointer backward
4.Finally return operation
*/
    static int theLoveLetterMystery(String s) {
        int i=0;
        int j=s.length()-1;
        int operation=0;
        while(i<j){
            operation+=Math.abs(s.charAt(i)-s.charAt(j));
            i++;
            j--;
        }
        return operation;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = theLoveLetterMystery(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
