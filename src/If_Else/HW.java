package If_Else;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if (a%5==0 && a%3==0)
            System.out.println("Apurva");

         else if (a%3==0)
        System.out.println("Banu");
        else if(a%5==0)
            System.out.println("Riya");
        else
            System.out.println("Isha");
    }
}
