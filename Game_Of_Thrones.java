import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class  Game_Of_Thrones{
    /*
    Algorithm:
    1.One Property of String Palindrome is that it has <= one odd occurence of a character in its String.
    2.So we need find that it has more than one odd occurence of a character.
    3.For that we use HashMap to keep track of occurence of a character using [containsKey(key),hm.values(),hm.put(key,value),get(key)] Methods.
    4.we return the result after eveluating its odd values.
    */
    static String gameOfThrones(String s) {
        char[] ch=s.toCharArray();
        Map<Character,Integer> hm=new TreeMap<>();
        for(char c:ch){
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }
            else{
                hm.put(c,1);
            }
        }
        int odd=0;
        for(Integer i:hm.values()){
            if(i%2!=0)  odd++;
        }
        return (odd>1)?"NO":"YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

       String s = scanner.nextLine();

        String result = gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
