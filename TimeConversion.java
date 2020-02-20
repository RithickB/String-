import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {
/*
Algorithm:
1.From the given String we need only Hour & AM/PM
2.So we Split that into three parts using substring method
3.we parse hr to int for comparison
4.We check it as PM/AM
5.If PM add 12 to hr,only when hr!=12(because till 13 it is only 12...) and check result==24 if Yes,simply replace it by 0
6.Else if AM we simply check hr==12.If yes we replace it by 0 else remains same.
7.We create new hr string to add '0' if hr<10
8.Finally we return hr+rest String.
*/
    static String timeConversion(String s) {
        String balance=s.substring(2,s.length()-2);
        int hr=Integer.parseInt(s.substring(0,2));
        String AMPM=s.substring(s.length()-2);
        if(AMPM.equals("PM")){
            if(hr!=12)  hr=hr+12;
            hr=(hr==24)?0:hr;
        }
        else            hr=(hr==12)?0:hr;
        String finalhr=String.valueOf(hr);
        if(hr<10)            finalhr='0'+String.valueOf(hr);
        else    finalhr=String.valueOf(hr);
        return finalhr+balance;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
