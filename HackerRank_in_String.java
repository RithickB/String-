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
1.here we have to maintain the sequence order of word "hackerrank".So we use indexOf().Otherwise we use contains().
2.we store hackerrank in String variable and convert the input to lowercase for our convenience;
3.For each character we check it from specified index.
4.if it does not contains the character then we simply change boolean value as false and break the loop
5.Return the output based on boolean value.
*/
    static String hackerrankInString(String s) {
        String str="hackerrank";
        s=s.toLowerCase();
        boolean check=true;
        int j=0;
        for(int i=0;i<str.length();i++){
            if(s.indexOf(str.charAt(i),j)>=0)           j=s.indexOf(str.charAt(i),j)+1;
            else{
                check=false;
                break;
            }
        }
        return (check)?"YES":"NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = hackerrankInString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
