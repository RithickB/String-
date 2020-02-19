import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
/*
Pseudocode:
1.we check that the given String has atleast 26 character(minimum character to satisfies the pangram condition).
2.we Store lowercase alphabet + whiteSpace in String variable & change given string to lower case for our convenience.
3.Then for each character of alphabet we check that given input has it.If not we change boolean check to false & break the loop.
4.return answer based on boolean check value.
*/
    // Complete the pangrams function below.
    static String pangrams(String s) {
        if(s.length()<26)   return "not pangram";
        String alpha="abcdefghijklmnopqrstuvwxyz ";
        boolean check=true;
        s=s.toLowerCase();
        for(int i=0;i<alpha.length();i++){
            if(!s.contains(Character.toString(alpha.charAt(i)))){
                check=false;
                break;
            }
        }
        return (check)?"pangram":"not pangram";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
