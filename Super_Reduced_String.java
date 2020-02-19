import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
Algorithm:
1.Create a Empty Stack;
2.For each character in String s check the Following Constrains
3.If,Stack is Empty then push the Character.
4.Else if Stack top char not equal to upcoming char the push the Character.
5.Else pop the char from the Stack.
*/
public class Super_Reduced_String {

    // Complete the superReducedString function below.
    static String superReducedString(String s) {
        Stack<Character> s1=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s1.isEmpty())    s1.push(s.charAt(i));
            else if(s1.peek()!=s.charAt(i))     s1.push(s.charAt(i));
            else s1.pop();
        }
        String result="";
        Iterator it=s1.iterator();
        while(it.hasNext()) result+=it.next();
        return (result!="")?result:"Empty String";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
