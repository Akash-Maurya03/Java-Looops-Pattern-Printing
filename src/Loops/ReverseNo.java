package Loops;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int e = 0;
        while (n != 0){
            e *= 10;
            e += n % 10;
            n /= 10;

        }
        System.out.println(e);
    }
}
