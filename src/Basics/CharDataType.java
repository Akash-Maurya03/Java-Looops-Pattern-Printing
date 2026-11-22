package Basics;

public class CharDataType {
    public static void main(String[] args) {
        char akash = 'S'; // character ko hmm '' me likhte hai
        int x  = akash; // implicit typecasting
        System.out.println(x);
        // typecasting - ek datatype se dusre datatype me convert krna
        char ch = 'a';
        int y = (int)ch;
        System.out.println(y);
        char tt = '3';
        System.out.println((int)tt);
        int z = 33;
        char h = (char)z;
        System.out.println(h);
    }
}
