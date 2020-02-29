import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*Question Link:https://www.hackerrank.com/challenges/weighted-uniform-string/problem
1.Here we use Stack(to evaluate uniform String values) & Set(to save uniform String values).
2.we run a loop for each character in a string
3.Initially we add that (character ascii value - 96) to the set.
4.Then we check stack top with the upcoming character
5.If both of them is same then we add that character to stack and add (((int)stack.peek()-96)*stack_size) to Set(keep track of contiguous subarray).
6.else clear stack and the add that new character to stack
7.for queries add "Yes" or "No" String to string array
8.Return the array
*/
public class weightedString {
    static String[] weightedUniformStrings(String s, int[] queries) {
        Stack<Character> s1=new Stack<>();
        Set<Integer> set1=new TreeSet<>();
        for (char i : s.toCharArray()) {
            set1.add((int)i-96);
            if (s1.isEmpty() || s1.peek() == i)
            {
                s1.push(i);
                set1.add(((int) s1.peek() - 96) * s1.size());
            }
            else if (!s1.isEmpty()) {
                s1.clear();
                s1.push(i);
            }
        }
        String[] str1=new String[queries.length];
        int j=0;
        for(int i:queries)  {
            if(set1.contains(i))                str1[j]="Yes";
            else    str1[j]="No";
            j++;
        }
        return str1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] queries = new int[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        String[] result = weightedUniformStrings(s, queries);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
