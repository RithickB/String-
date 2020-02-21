import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Gemstones {
/*
1.As the Question reveals the output is total number of common gemstones in all rock.
2.Here we use two set.
3.First we add all element of first array to set 1
4.Inside loop We create new set s2 and One String into it and retainAll between the two set & repeat this untill we reach end of array
5.Return set1.size()[Number of Unique Gemstones].
*/
    static int gemstones(String[] arr) {
        String str1=arr[0];
        Set<Character> s1=new LinkedHashSet<>();
        for(int i=0;i<str1.length();i++)    s1.add(str1.charAt(i));
        for(int i=1;i<arr.length;i++){
            str1=arr[i];
            Set<Character> s2=new LinkedHashSet<>();
            for(int j=0;j<str1.length();j++)    s2.add(str1.charAt(j));
            s1.retainAll(s2);
        }
        return s1.size();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String arrItem = scanner.nextLine();
            arr[i] = arrItem;
        }

        int result = gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
