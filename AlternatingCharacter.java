import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
/*
1.Here we need to count number of adjacent Character except first character
2.So we use Stack which increase count when Stack peek == upcoming Character
3.return count.
*/
    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        Stack<Character> s1=new Stack<>();
        s1.push(s.charAt(0));
        int count=0;
        for(int i=1;i<s.length();i++){
            if(s1.peek()==s.charAt(i))  count++;
            else    s1.push(s.charAt(i));
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
