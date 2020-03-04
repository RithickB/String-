/*Convert the ASCII value sentence to its equivalent string
Given a string str which represents the ASCII Sentence, the task is to convert this string into its equivalent character sequence.
Input: str = “104101108108111443211911111410810033”
Output: hello, world!
*/
/*
Algorithm:
1.We initialize a variable num=0 which holds the number in string which is going to be a character later.
2.for each character in string we append the character to num until num>=32 && num<=122(here we use 32 to 122 to conver all the special characters)
3.Here while appending the character we can't use (int) in prefix of character because it returns ASCII value
4.To get the value of number as it is,we use Character.getNumericalValue(ch) method which returns exact number of the character(not its ASCII).
5.After we reach the above limit for num we simply parse it into a character using (char) in prefix & add it to resultant string & change num=0;
*/
public class  AsciiToAlpha{
    static String asciitoAlphabet(String s){
        int num=0;
        String result="";
        for(int i=0;i<s.length();i++){
            // Append the current digit 
            num=(num*10)+Character.getNumericValue(s.charAt(i));
            if(num>=32&&num<=122){
                //Append the character to result String
                result+=(char)num;
                //Reset to 0 once we get our specified character
                num=0;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(asciitoAlphabet("7110110110711510211111471101101107115"));
    }
    }
