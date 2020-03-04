/*
Missing characters to make a string Pangram
Pangram is a sentence containing every letter in the English alphabet.
Given a string, find all characters that are missing from the string, i.e., the characters that can make string a Pangram.
We need to print output in alphabetic order.
Examples:
Input : welcome to geeksforgeeks
Output : abdhijnpquvxyz
*/
/*
Algorithm:
1.Here We use HashMap && Character.isLetter() Method[to determine whether the character is letter or not].
2.Initially we add all alphabet into hash map with alphebet [a-z] as key && 0 as value
3.Then for each character in string we change the hashMap value by increment by 1
4.Finally we run the for loop,inside it for each character with value 0 in hashmap are our specified character
5.So we append it into our String & returns output after loop ends
*/
import java.util.*;
public class pangramConversion {
    static String pangramConversionMethod(String s){
        Map<Character,Integer> hm=new LinkedHashMap<>();
        String result="";
        for(char i='a';i<='z';i++)            hm.put(i,0);
        for(char i:s.toCharArray()){
            if(Character.isLetter(i)){
                hm.put(i,hm.get(i)+1);
            }
        }
        for(char i:hm.keySet()){
            if(hm.get(i)==0){
                result+=i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(pangramConversionMethod("welcome to geeksforgeeks"));
    }
}
