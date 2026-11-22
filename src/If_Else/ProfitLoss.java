package If_Else;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Cp: ");

        int cp = sc.nextInt();
        System.out.print("Enter a Sp: ");
        int sp = sc.nextInt();
        if (cp > sp)
            System.out.println("loss is " +(cp-sp));
        else if (cp < sp)
            System.out.println("profit is " +(sp - cp));
        if (cp == sp)
            System.out.println("no profit no loss");
    }
}
