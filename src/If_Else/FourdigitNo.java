package If_Else;

import java.util.Scanner;

public class FourdigitNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        if(a>999 && a<10000)
            System.out.println("Four digit NO.");
        else System.out.println("Not a four digit no.");
    }
}
