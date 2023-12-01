package basic;

import java.nio.charset.CharsetEncoder;

public class Wrapper {
    public static void main(String[]args){
        Integer number =12;
        int num2 = 12;
        String sth = number.toString();
        Character chara = 'A';
        System.out.println(number.byteValue());
        System.out.println(number.compareTo(num2));
        System.out.println(sth);
    };
}
