package Loops;

import java.util.Scanner;

public class CompoNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        boolean flag = true; // true means prime
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n%i==0){ // i to n ka ek factor nikla
//                System.out.println("Composite no.");
                flag = false; // false means composite

                break;
            }


        }
        if(n==1) System.out.println("Neither prime nor composite");
        else if (flag==false) System.out.println("Composite no.");
        else  System.out.println("Prime no.");
    }
}
