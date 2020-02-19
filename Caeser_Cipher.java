import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Caeser_Cipher {
/*
Algorithm:
1.We first find how many character exactly we have to shift by get % value of k with 26.
2.Run loop for length of String
3.While Running check that the character isLetter or not.
4.if not we simply add it to our String.
5.If it is,the we check the lowercase & uppercase.
6.for both the above cases after encode it check for it alphabet limit & if it exit the limit we subtract its ASCII value to get correct value
*/
    static String caesarCipher(String s, int k) {
        String result="";
        k=k%26;
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                char check=s.charAt(i);
                if((int)check>=65&&(int)check<=90){
                    check=(char)((int)check+k);
                    if(check>90){
                        check=(char)((int)check-26);
                    }
                    result+=check;
                }
                else if((int)check>=97&&(int)check<=122){
                    check=(char)((int)check+k);
                    if(check>122){
                        check=(char)((int)check-26);
                    }
                    result+=check;
                }
            }
            else                result+=s.charAt(i);
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
