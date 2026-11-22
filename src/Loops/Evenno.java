package Loops;

import java.util.Scanner;

public class Evenno {
    public static void main(String[] args) {
        System.out.println("even no.");
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
