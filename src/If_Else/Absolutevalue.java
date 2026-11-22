package If_Else;

import java.util.Scanner;

public class Absolutevalue {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if (a>= 0) System.out.println(a);
        else System.out.println(-a);
        double n = sc.nextDouble();
        int x = (int)n;
        if(n-x == 0) System.out.println("not an integer");
        else System.out.println("an integer");
    }
}
