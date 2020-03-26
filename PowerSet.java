package com.test123;
import java.math.*;
import java.util.*;

public class PowerSet {
    public static void main(String[] args) {
        int[] s={1,2,3};
        int pow_len=(int)Math.pow(s.length,2);
        for(int i=0;i<pow_len;i++){
            for(int j=0;j<s.length;j++){
                if((i&(1<<j))!=0) System.out.print(s[j]);
            }
            System.out.println();
        }
    }
}
