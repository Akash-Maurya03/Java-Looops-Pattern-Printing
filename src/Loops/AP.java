package Loops;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out .println("AP OF NO.2");
        int n = sc.nextInt();
//        for (int i = 2; i <= 3*n-1; i=i+3) {
//            System.out.println(i);
        int a = 4, d = 6;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a += d;
        }
    }
}
