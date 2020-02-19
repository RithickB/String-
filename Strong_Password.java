import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public Strong_Password {
/*
Algorithm:
1.We create seperate String representing number,lowerCase,upperCase & Special Character.
2.Then create boolean value for above String to check it is already checked or not && create count=4(number of condition to check).
3.For each character in password we check that character present in the created String or not.
4.If Yes we decrement count and make boolean value as false.
5.Finally we check the length of the given String>Specified number.
6.If Yes we simply return count.
7.Else  we check greater value between count & (specified number - count) and return greater value.
*/
    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        String num="0123456789";
        String alpha="abcdefghijklmnopqrstuvwxyz";
        String alpha1=alpha.toUpperCase();
        String special="!@#$%^&*()-+";
        int count=4;
        boolean numCheck=true,alphaCheck=true,alpha1Check=true,specialCheck=true;
        for(int i=0;i<password.length();i++){
            if((num.contains(Character.toString(password.charAt(i))))&&numCheck){
                count--;
                numCheck=false;
            }
            if((alpha.contains(Character.toString(password.charAt(i))))&&alphaCheck){
                count--;
                alphaCheck=false;
            }
            if((alpha1.contains(Character.toString(password.charAt(i))))&&alpha1Check){
                count--;
                alpha1Check=false;
            }
            if((special.contains(Character.toString(password.charAt(i))))&&specialCheck)            {   count--;
                specialCheck=false;
            }
        }
        if(n>6) return count;
        else{
            int check=6-n;
            if(count>check) return count;
            else return check;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
