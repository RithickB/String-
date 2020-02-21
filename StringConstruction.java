import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StringConstruction {
/*
Algorithm:
1.Since the Question reveals that the minimum cost is number of unique characters in the String.
2.Here we use Set to finf unique character & return Set size(Which is minimum cost to construct String).
*/
    // Complete the stringConstruction function below.
    static int stringConstruction(String s) {
        Set<Character> s1=new LinkedHashSet<>();
        for(int i=0;i<s.length();i++)            s1.add(s.charAt(i));
        return s1.size();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = stringConstruction(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
