import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FunnyString {
/*
1.Here we first copy the ascii value of the string in same & reversed order in array using single loop.
2.Then in the second loop we subtract the current value with the previous value for both the array and compare its absolute value
3.If it does not match the we return "Not Funny"
4.If it Successfully crossed the above loop we return "Funny".
*/
    static String funnyString(String s) {
        int[] beforeReverse=new int[s.length()];
        int[] afterReverse=new int[s.length()];
        int j=s.length()-1;
        for(int i=0;i<s.length();i++){
            beforeReverse[i]=(int)s.charAt(i);
            afterReverse[j]=(int)s.charAt(i);
            j--;
        }
        for(int i=1;i<s.length();i++){
            if(Math.abs(beforeReverse[i]-beforeReverse[i-1])!=Math.abs(afterReverse[i]-afterReverse[i-1]))                return "Not Funny";
        }
        return "Funny";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
