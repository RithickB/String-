import java.util.*;
/*
Algorithm:
1.Here we need only hour so we split it using substring method & parse it.
2.Now we check if (hr>=12)  if it not equals 12 then we subtract it by 12 otherwise we simply have it.
3.else if it is (hr<12) we check that it is <10 if yes we add 0 to it else we simply take it.
4.We return the desired result
*/
public class TimeConversion_24to12 {
    static String timeConversion(String s) {
        int hr = Integer.parseInt(s.substring(0, 2));
        String rest = s.substring(2);
        if (hr >= 12) {
            hr = (hr != 12) ? (hr - 12) : 12;
            rest = String.valueOf(hr) + rest + "PM";
        } else {
            hr = (hr != 0) ? hr : 12;
            String final_hr="";
            if(hr<10)   final_hr='0'+String.valueOf(hr);
            else    final_hr=String.valueOf(hr);
            rest =  final_hr+ rest + "AM";
        }
        return rest;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(timeConversion("12:45:54"));
    }
}
