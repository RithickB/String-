import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
Algorithm:
1.Here we simple Check for UpperCase character in the given String.
2.If we encounter any uppercase character(new word) the we count++;
3.return count.
4.If they asked to get the word seperated by any character we simply create a empty String and add the character to it by checking its uppercase
*/
public class CamelCase {

    // Complete the camelcase function below.
    static int camelcase(String s) {
        int count=1;
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i)))  count++;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = camelcase(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
